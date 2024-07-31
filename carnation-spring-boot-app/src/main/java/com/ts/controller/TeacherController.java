package com.ts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
	
	@GetMapping("/tch")
	public String tchMethod() {
		return "We are in teacher's file";
	}
}
