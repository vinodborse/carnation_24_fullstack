package com.ts;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

	@GetMapping("/add")
	public String data() {
		int a = 7;
		int b = 9;
		return "RESULT:-" + (a+b);
	}
	
	@PostMapping("/smp")
	public String sample() {
		return "WE ARE IN POST OF SAMPLE METHOD";
	}
	
	
}
