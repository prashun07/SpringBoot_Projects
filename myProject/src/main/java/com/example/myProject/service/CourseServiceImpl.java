package com.example.myProject.service;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myProject.Repository.CourseRepository;
import com.example.myProject.entities.Course;
@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public List<Course> getCourses() {
		
		return courseRepo.findAll();
	}
	@Override
	public Course getCourse(long courseId) {
		return courseRepo.findById(courseId).get();
		
	}
	@Override
	public Course addCourse(Course course) {
//		list.add(course);
		return courseRepo.save(course);
	}
	@Override
	public Course updateCourse(Long courseId,Course course) {
Course cr=courseRepo.findById(courseId).get();
 if(Objects.nonNull(course.getTitle())&&!"".equalsIgnoreCase(course.getTitle())) {
	 cr.setTitle(course.getTitle());
 }
 if(Objects.nonNull(course.getDescription())&&!"".equalsIgnoreCase(course.getDescription())) {
	 cr.setDescription(course.getDescription());
 }

	 return courseRepo.save(cr);
	}
	@Override
	public void deleteCourse(long courseId) {
		courseRepo.deleteById(courseId);
	}

}
