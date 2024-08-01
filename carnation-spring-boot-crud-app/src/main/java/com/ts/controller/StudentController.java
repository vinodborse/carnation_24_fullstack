package com.ts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;
import com.ts.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping("/add-student")
	public Student addStudent(@RequestBody Student student) {
		return ss.addStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		return ss.getStudents();
	}
}


//C create   Post
//R select   Get
//U update   Put
//D delete   Delete




