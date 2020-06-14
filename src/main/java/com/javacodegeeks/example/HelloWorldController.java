package com.javacodegeeks.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public String sayHello() {
		return "Hello Java Code Geeks! Taking Changes in place. Testing continued one after another......on 14th June 1";
	}
}
