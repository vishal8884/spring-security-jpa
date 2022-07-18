package io.vishal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "welcome to home page";
	}
	
	@GetMapping("/user")
	public String user() {
		return "welcome to user page";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "welcome to admin page";
	}
	

}
