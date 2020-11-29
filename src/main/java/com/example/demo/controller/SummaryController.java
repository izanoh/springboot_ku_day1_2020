package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.request.SummaryRequest;
import com.example.demo.controller.response.SummaryResponse;

@RestController
public class SummaryController {

	@PostMapping(path = "/sum")
	public SummaryResponse postHello(
			@RequestBody SummaryRequest request)  {
		SummaryResponse response = 
				new SummaryResponse();
		int summary = request.getNumber1() +
				request.getNumber2();
		response.setSummary(summary);
		return response;
	}
}
