package in.col.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.col.model.CollegeInfo;
import in.col.service.CollegeImpl;

@RestController
public class CollegeController {

	@Autowired
	CollegeImpl collegeImpl;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveCollRecords(@RequestBody CollegeInfo collegeInfo){
		String saveCollege = collegeImpl.saveCollege(collegeInfo);
		return new ResponseEntity<String>(saveCollege, HttpStatus.CREATED);
	}

	@GetMapping("/college")
	public ResponseEntity<List<CollegeInfo>> getAllCollege(){
		List<CollegeInfo> allBook = collegeImpl.getAllBook();
		return new ResponseEntity<List<CollegeInfo>>(allBook, HttpStatus.OK);
	}
	
	@GetMapping("/college/{id}")
	public ResponseEntity<CollegeInfo> getCollById(@PathVariable Integer id){
		CollegeInfo collegeById = collegeImpl.getCollegeById(id);
		return new ResponseEntity<CollegeInfo>(collegeById, HttpStatus.OK);
	}
	
	@DeleteMapping("/college/{id}")
	public ResponseEntity<String> deleteCollById(@PathVariable Integer id){
		String deleteCollegeById = collegeImpl.deleteCollegeById(id);
		return new ResponseEntity<String>(deleteCollegeById, HttpStatus.OK);
	}
}
