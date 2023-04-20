package com.project.apitest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {
	@GetMapping("/api")
	public String HelloWorld(){
		return "Hello world";
	}
}
