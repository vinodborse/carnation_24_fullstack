package com.ts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	List<Student> findByNameAndAddress(String name, String address);	//SELECT * FROM student WHERE name = '' AND address = '';
	
	List<Student> findByName(String name);
	
}
