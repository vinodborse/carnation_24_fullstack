package com.ts;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	
	@Autowired
	Employee emp;
	
	@Autowired
	Common c;
	
	public void userDataMethod() {
		
		System.out.println("We are in Users data method");
		emp.employeeDataMethod();
	}
}
