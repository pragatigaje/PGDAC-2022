package com.pragati.cntr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
	@GetMapping(value = {"/Hello"})
	public String sayHello() {
		return "Hello Spring Boot !!!";
	}
}
