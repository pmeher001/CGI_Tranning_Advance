package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.FeignService;

@RestController
@RequestMapping("feign")
public class FeignController {

	@Autowired
	FeignService feignService;
	
	// http://localhost:8585/feign/findBalance/100
	
	@GetMapping(value = "findBalance/{accno}")
	public String findAccountBalance(@PathVariable int accno) {
		return feignService.findAccountBalance(accno);
	}
	
	// http://localhost:8585/feign/findAccount/ajay@gmail.co
	
	@GetMapping(value = "findAccount/{emailId}")
	public int findAccountNumber(@PathVariable String emailId) {
		return feignService.findAccountNumber(emailId);
	}
}
