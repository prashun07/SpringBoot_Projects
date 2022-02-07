package com.example.myProject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private long Courseid;
private String title;
private String description;
public long getId() {
	return Courseid;
}
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public Course(long id, String title, String description) {
	super();
	this.Courseid = id;
	this.title = title;
	this.description = description;
}
public void setId(long id) {
	this.Courseid = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

@Override
public String toString() {
	return "Course [id=" + Courseid + ", title=" + title + ", description=" + description + "]";
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
