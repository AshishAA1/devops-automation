package com.ashish.boot.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getMessage")
public class controller {

	@GetMapping("/hello")
	public String getMessage() {

		return "Hello World message!!!!";
	}
	
	@GetMapping("/hello2")
	public String getMessage2() {

		return "Hello World message2!!!!";
	}
	
}
