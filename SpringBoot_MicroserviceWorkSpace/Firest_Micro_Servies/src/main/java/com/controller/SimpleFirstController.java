package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleFirstController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String firstClient() {
		return "Welcome to Simple Micro Service REST API";
	}
}
