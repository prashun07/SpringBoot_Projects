package com.springproject.collegedb.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.collegedb.entities.StudentClass;
@Repository
public interface StudentRepository extends JpaRepository<StudentClass, Long> {

}
