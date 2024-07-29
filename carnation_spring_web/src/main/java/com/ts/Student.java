package com.ts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // -> @Controller + @ResponseBody
public class Student {

	@GetMapping("/std")
    public String std() {
         return "We are in Student Servlet file.";
    }
	
	@GetMapping("/smp")
	public String sample() {
		return "Sample file calling";
	}
}



//@Component
//
//@Repository
//@Service
//@Controller

//@Mapping
//
//doGet	->  @GetMapping
//doPost	->  @PostMapping
//doPut	->  @PutMapping
//doDelete -> @DeleteMapping