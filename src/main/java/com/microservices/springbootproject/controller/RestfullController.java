package com.microservices.springbootproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfullController {

	@GetMapping("/test")
	private String test() {
		return "Restfull API";
	}
}
