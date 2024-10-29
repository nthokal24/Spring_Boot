package com.ashok.service;

import java.util.List;

import com.ashok.model.Course;

public interface CourseService {
	
	public String upsert(Course course );
	
	public Course getByID(Integer cid);
	
	public List<Course> getAllCourses();
	
	public String deleteById(Integer cid);
}
