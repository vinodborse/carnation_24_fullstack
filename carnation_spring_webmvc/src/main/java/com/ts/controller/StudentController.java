package com.ts.controller;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;

@RestController
public class StudentController {

	@GetMapping("/student")
	public Student getStudent() {
		return new Student(1, "Vinod", "Pune");
	}
	
	@GetMapping("/students/{sn}")
	public Student getStudents(@PathVariable("sn") String studentName) {
		
		Student s1 = new Student(1, "Vinod", "Pune");
		Student s2 = new Student(2, "Don", "Pune");
		Student s3 = new Student(3, "Anarkali", "Pune");
		
		List<Student> students = Arrays.asList(s1, s2, s3);		
		
		for(Student student : students) {
			if(studentName.equals(student.getName())) {
				return student;
			} 
		}
		return new Student();
	}
	
	@GetMapping("/pv-hello/{nm}") // localhost:8080/app_name/hello/Vinod 
	public String hello(@PathVariable("nm") String name) {
		return "Hello "+ name;
	}
	
	@GetMapping("/rp-hello") // localhost:8080/app_name/hello?fnm=Vinod&lnm=Borse
	public String rpHello(@RequestParam("fnm") String fname, @RequestParam("lnm") String lname) {
		return "Hello "+ fname +" "+lname;
	}
	
	@GetMapping("/rb-std")
	public String rbStd(@RequestBody Student student) {
		
		return "You have added "+ student.getName(); 
	}
	
}



//@PathVariable
//@RequestParam
//@RequestBody

