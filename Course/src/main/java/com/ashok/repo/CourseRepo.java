package com.ashok.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashok.model.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
