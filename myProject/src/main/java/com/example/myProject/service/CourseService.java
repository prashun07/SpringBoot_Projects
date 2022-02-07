package com.example.myProject.service;

import java.util.List;


import com.example.myProject.entities.Course;
public interface CourseService {
	public List<Course>getCourses();
	public Course getCourse(long courseId);
	public Course addCourse(Course course);
	public Course updateCourse(Long courseId, Course course);
	public void deleteCourse(long courseId);
}
