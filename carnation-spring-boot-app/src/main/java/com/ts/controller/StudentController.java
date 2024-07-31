package com.ts.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;
import com.ts.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService ss;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello STUDENT";
	}
	
	@GetMapping("/student")
	public Student getStudent(@RequestParam("name") String name) {

		
		return ss.getStudent(name);
		
	}
}
