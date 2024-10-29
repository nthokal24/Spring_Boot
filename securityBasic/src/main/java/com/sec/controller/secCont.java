package com.sec.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sec")
public class secCont {


	@GetMapping("/admin")
	public String adminUser() {	
		return "Admin User";
	}
	
	@GetMapping("/normal")
	public String normalUser() {	
		return "Normal User";
	}
	
	
	@GetMapping("/all")
	public String allUser() {	
		return "All User";
	}
	
	
	
	
}
