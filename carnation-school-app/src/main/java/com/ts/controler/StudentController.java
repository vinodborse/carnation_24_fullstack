package com.ts.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;
import com.ts.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping("/student")
	public Student addStudent(@RequestBody Student student) {
		return ss.addOrUpdateStudent(student);
	}
	
	@GetMapping("/student")
	public Student getStudent(@RequestParam("rollno") Long rollno) {
		return ss.getStudent(rollno);
	}
	
	@GetMapping("/student-by-name")
	public List<Student> getStudentByName(@RequestParam("name") String name) {
		return ss.getStudentByName(name);
	}
	
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student) {
		return ss.addOrUpdateStudent(student);
	}
	
}
