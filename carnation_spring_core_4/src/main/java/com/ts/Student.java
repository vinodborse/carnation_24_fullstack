package com.ts;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	private Batch batch;
	
	@Autowired
	private Teacher teacher;
		
	public void helloStudent() {
		System.out.println("We are in student class");	
		batch.batchName();
		teacher.teacherDetails();
	}
}
