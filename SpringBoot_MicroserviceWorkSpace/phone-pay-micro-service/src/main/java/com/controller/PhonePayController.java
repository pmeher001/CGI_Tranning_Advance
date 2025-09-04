package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.PhonePay;
import com.service.PhonePayService;

@RequestMapping("phonepay")
@RestController
public class PhonePayController {

	@Autowired
	PhonePayService phonePayService;
	
	// http://localhost:8484/phonepay/create
	// method : post 
	// data : {"emailId":"raj@gmail.co"}
	// data : {"emailId":"mahes@gmail.co"}
	
	@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String phonePayAccountCreate(@RequestBody PhonePay phonePay) {
		return phonePayService.createPhonePayAccount(phonePay);
	}
}
