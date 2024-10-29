package in.col.service;

import java.util.List;

import in.col.model.CollegeInfo;

public interface CollegeService {

	public String saveCollege(CollegeInfo collegeInfo);

	public List<CollegeInfo> getAllBook();
	
	public CollegeInfo getCollegeById(Integer id);
	
	public String deleteCollegeById(Integer id);
	
}
