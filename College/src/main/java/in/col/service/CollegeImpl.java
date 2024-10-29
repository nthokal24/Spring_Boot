package in.col.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.col.model.CollegeInfo;
import in.col.repo.CollegeRepo;

@Service
public class CollegeImpl implements CollegeService{

	@Autowired
	CollegeRepo collegeRepo;
	
	@Override
	public String saveCollege(CollegeInfo collegeInfo) {
		collegeRepo.save(collegeInfo);
		return "Record Saved";
	}

	@Override
	public List<CollegeInfo> getAllBook() {
		return collegeRepo.findAll();
		
	}

	@Override
	public CollegeInfo getCollegeById(Integer id) {
		Optional<CollegeInfo> byId = collegeRepo.findById(id);
		if(byId.isPresent()) {
			return byId.get();
		}
		return null;
	}

	@Override
	public String deleteCollegeById(Integer id) {
		if(collegeRepo.existsById(id)) {
			collegeRepo.deleteById(id);
			return "Record Deleted";
		}
		return "Record not found";
	}

}
