package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feign.service.AccountFeignService;

@Service
public class FeignService {

	@Autowired
	AccountFeignService accountFeignService;
	
	public String findAccountBalance(int accno) {
		return accountFeignService.findBalance(accno);
	}
	
	public int findAccountNumber(String emailid) {
		return accountFeignService.findAccountNumber(emailid);
	}
}
