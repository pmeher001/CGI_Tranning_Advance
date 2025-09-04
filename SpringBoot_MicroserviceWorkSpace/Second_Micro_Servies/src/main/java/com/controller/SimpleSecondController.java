package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleSecondController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String firstClient() {
		return "Welcome to Simple Micro Service REST API Version 2";
	}
}
