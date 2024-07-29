package com.ts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employee {
	
	@GetMapping("/emp-name")
	public Emp name() {
		return new Emp(1, "Vinod", "Pune", 120);
	}
	
	@GetMapping("/emps")
	public List<Emp> emps() {
		List<Emp> employees = new ArrayList<>();
		
		Emp emp1 = new Emp(1, "Vinod", "Pune", 120);
		Emp emp2 = new Emp(2, "Rahul", "Pune", 23);
		Emp emp3 = new Emp(3, "Don", "Faltu gali", 30000);
		Emp emp4 = new Emp(4, "Anarkali", "Salim ki gali", 1000);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		return employees;
	}

}
