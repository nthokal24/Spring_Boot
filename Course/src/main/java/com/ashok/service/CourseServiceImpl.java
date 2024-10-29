package com.ashok.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashok.model.Course;
import com.ashok.repo.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepo courseRepo;

	@Override
	public String upsert(Course course) {// If Object has primary key then it will update the records
		courseRepo.save(course); // If Object not have primary key then save the new data
		return "success";
	}

	@Override
	public Course getByID(Integer cid) {
		Optional<Course> findById = courseRepo.findById(cid);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		if (courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "Delete Success";
		} else {
			return "No record found";
		}
	}
}
