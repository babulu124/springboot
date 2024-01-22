package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
	
	
	
	@GetMapping("/okkk")
	public String name() {
		String name="hey aree";
		
		return name;
	}
	
	
	
	
	

}
