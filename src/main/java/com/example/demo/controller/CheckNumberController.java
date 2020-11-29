package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.request.IsOddRequest;
import com.example.demo.controller.response.IsOddResponse;

@RestController
public class CheckNumberController {

	@PostMapping("/isOdd")
	public IsOddResponse isOdd(@RequestBody IsOddRequest request) {
		
		IsOddResponse response = new IsOddResponse();
		if (request.getNumber() % 2 ==0) {
			response.setOdd(false);
		} else {
			response.setOdd(true);
		}
		return response;
	}
}
