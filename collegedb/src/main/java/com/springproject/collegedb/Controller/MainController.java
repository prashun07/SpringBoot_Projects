package com.springproject.collegedb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.collegedb.entities.StudentClass;
import com.springproject.collegedb.services.StudentService;


@RestController
public class MainController {
	@Autowired
private StudentService studentService;
	@GetMapping("/students")
	public List<StudentClass> getDetails() {
		return this.studentService.getDetails();
	}
	@PostMapping("/students")
	public StudentClass addDetails(@RequestBody StudentClass StudentDetails) {
		return this.studentService.addDetails(StudentDetails);
	}
	@GetMapping("/students/{studentId}")
	public StudentClass getDetailsById(@PathVariable String studentId)
	{
		return this.studentService.getDetailsById(Long.parseLong(studentId));
	}
	//Update the database
	@PutMapping("/students/{studentId}")
	public StudentClass updateDetailsById(@PathVariable String studentId,@RequestBody StudentClass DetailsToUpdate)
	{
		return this.studentService.updateDetailsById(Long.parseLong(studentId),DetailsToUpdate);
	}
	//Delete from database
	@DeleteMapping("/students/{studentId}")
	public void deleteDetailsById(@PathVariable String studentId)
	{
		try {
			 this.studentService.deleteDetailsById(Long.parseLong(studentId));
		}catch(Exception ex) {
			System.out.println("Invalid ID!!Cannot Delete data");
		}
	}
}
