package com.springproject.collegedb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springproject.collegedb.Repository.StudentRepository;
import com.springproject.collegedb.entities.StudentClass;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepo;
	@Override
	public List<StudentClass> getDetails() {
		return studentRepo.findAll();
	}
	@Override
	public StudentClass addDetails(StudentClass StudentDetails) {
		return studentRepo.save(StudentDetails);
	}
	@Override
	public StudentClass getDetailsById(long parseLong)
	{
		return studentRepo.findById(parseLong).get();
	}
	@Override
	public StudentClass updateDetailsById(long parseLong, StudentClass detailsToUpdate) {
		StudentClass student=studentRepo.findById(parseLong).get();
		if(student.getStudentId()==detailsToUpdate.getStudentId())
		{ if(detailsToUpdate.getStudentName()!=""&& detailsToUpdate.getDepartmentName()!="")
		   {student.setStudentName(detailsToUpdate.getStudentName());
			student.setDepartmentName(detailsToUpdate.getDepartmentName());
			student.setStudentAge(detailsToUpdate.getStudentAge());
		   }
		}
		return student;
	}
	@Override
	public void deleteDetailsById(long parseLong)
	{ 
		 studentRepo.deleteById(parseLong);
	}
}
