package com.example.myProject.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.myProject.entities.Course;
import com.example.myProject.service.CourseService;

@RestController
public class MyController {
	@Autowired
private CourseService courseService;

	//Get the courses
	@GetMapping("/courses")
	public List<Course>getCourses(){
		return this.courseService.getCourses();
		}
	//Get course using id
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));}
	
	//Add new Course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.courseService.addCourse(course);
	}
	//Update course
	@PutMapping("/courses/{courseId}")
	public Course updateCourse(@PathVariable Long courseId, @RequestBody Course course) {
		return this.courseService.updateCourse(courseId,course);
	}
	//Delete the Course
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus>deleteCourse(@PathVariable String courseId){
		try {
			this.courseService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception ex) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}