package com.springproject.collegedb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentClass {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 private Long StudentId;
 private String StudentName;
 private String DepartmentName;
 private Integer StudentAge;
public StudentClass() {
	super();//Default Constructor
}
@Override
public String toString() {
	return "StudentClass [StudentId=" + StudentId + ", StudentName=" + StudentName + ", DepartmentName="
			+ DepartmentName + ", StudentAge=" + StudentAge + "]";
}
public StudentClass(Long StudentId, String StudentName, String departmentName, Integer studentAge) {
	super();
	this.StudentId = StudentId;
	this.StudentName = StudentName;
	this.DepartmentName = departmentName;
	this.StudentAge = studentAge;
}
public Long getStudentId() {
	return StudentId;
}
public void setStudentId(Long studentId) {
	this.StudentId = studentId;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	this.StudentName = studentName;
}
public String getDepartmentName() {
	return DepartmentName;
}
public void setDepartmentName(String departmentName) {
	this.DepartmentName = departmentName;
}
public Integer getStudentAge() {
	return StudentAge;
}
public void setStudentAge(Integer studentAge) {
	this.StudentAge = studentAge;
}

 
}
