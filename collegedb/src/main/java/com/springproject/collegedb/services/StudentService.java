package com.springproject.collegedb.services;

import java.util.List;
import com.springproject.collegedb.entities.StudentClass;


public interface StudentService {
public List<StudentClass>getDetails();
public StudentClass addDetails(StudentClass StudentDetails);
public StudentClass getDetailsById(long parseLong);
public StudentClass updateDetailsById(long parseLong, StudentClass detailsToUpdate);
public void deleteDetailsById(long parseLong);
}
