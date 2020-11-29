package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.request.HelloRequest;

@RestController
public class HelloController {
	
	@GetMapping(path = "/sayHello")
	public String sayHello() {
		return "Hello";
	}
	

	@GetMapping(path = "/sayHello/{name}/{age}")
	public String sayHelloWithName(
			@PathVariable("name") String name,
			@PathVariable("age") int age) {
		return "Hello, " + name + " | age :" + age;
	}
	
	@GetMapping(path = "/param")
	public String sayHelloWithParam(
			@RequestParam(
					name = "name", 
					required = false
			) String name, 
			@RequestParam("age") int age, 
			@RequestParam("firstname2") String fName) {
		return "Hello, " + name + 
				" | age :" + age +
				" | first name : " + fName;
	}
	
	@PostMapping(path = "/post")
	public String postHello(
			@RequestBody HelloRequest request)  {
		return request.getFirstName() + 
				request.getAge();
	}
	
}






