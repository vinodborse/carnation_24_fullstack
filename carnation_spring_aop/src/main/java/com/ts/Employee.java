package com.ts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	@Autowired
	Common c;
	
	public void employeeDataMethod() {
		
		System.out.println("We are in Employees data method");
	
	}
}
