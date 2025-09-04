package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Account;
import com.service.AccountService;

@RestController
@RequestMapping("account")   // http://localhost:8383/account/*
public class AccountController {

	@Autowired
	AccountService accountService;
	
	
//	@RequestMapping(value = "create",
//			method = RequestMethod.POST,
//			consumes = MediaType.APPLICATION_JSON_VALUE)

	// http://localhost:8383/account/create
		// method : post 
		// data : {"accno":100,"name":"raj","emailId":"raj@gmail.co","amount":1400}
		
	
	@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAccount(@RequestBody Account Account) {
		return accountService.createAccount(Account);
	}
	
	// http://localhost:8383/account/findBalance/100
		// http://localhost:8383/account/findBalance/1000
			// method : get 
	
	
	@GetMapping(value = "findBalance/{accno}")
	public String findBalance(@PathVariable int accno) {
		return accountService.findAccountBalance(accno);
	}

	// http://localhost:8383/account/findAccount/raj@gmail.co
	
		// method : GET 
		
	
	@GetMapping(value = "findAccount/{emailId}")
	public int findBalance(@PathVariable String emailId) {
		return accountService.findAccountNumbre(emailId);
	}
}
