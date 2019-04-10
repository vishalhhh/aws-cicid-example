package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello, Vishal, Welcome to AWS!!";
	}

}