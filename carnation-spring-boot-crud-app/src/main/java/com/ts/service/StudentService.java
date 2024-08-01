package com.ts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Student;
import com.ts.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository sr;
	
	public Student addStudent(Student student) {
		return sr.save(student);
		
	}

	public List<Student> getStudents() {
		return sr.findAll();
	}
}
