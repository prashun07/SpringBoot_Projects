package com.example.myProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myProject.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long>{
	

}
