package com.ts.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ts.model.Student;

@Service
public class StudentService {

	public Student getStudent(String name) {
		Student s1 = new Student(1, "Vinod", "Pune");
		Student s2 = new Student(2, "Don", "Pune");
		Student s3 = new Student(3, "Anarkali", "Pune");
		
		List<Student> students = Arrays.asList(s1, s2, s3);
		
		for(Student student: students) {
			if(student.getName().equals(name)) {
				return student;
			}
		}
		
		return new Student();
	}
}
