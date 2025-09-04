package com.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Account-Micro-Service")
public interface AccountFeignService {

	@GetMapping(value = "account/findBalance/{accno}")
	public String findBalance(@PathVariable int accno);
	
	@GetMapping(value = "account/findAccount/{emailId}")
	public int findAccountNumber(@PathVariable String emailId);
}
