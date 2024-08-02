package com.ts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Student;
import com.ts.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sr;
	
	public Student addOrUpdateStudent(Student student) {
		return sr.save(student);
	}

	public Student getStudent(Long rollno) {
	
		Optional<Student> std = sr.findById(rollno);
		
//		if(std.isPresent()) {
//			return std.get();
//		} else {
//			return new Student();
//		}
		
		return std.isPresent()? std.get() : new Student();
	}

	public List<Student> getStudentByName(String name) {
		return sr.findByName(name);
	}
	
	
	
	
	
}
