package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entity.PhonePay;
import com.repository.PhonePayRepository;

@Service
public class PhonePayService {

	@Autowired
	PhonePayRepository phonePayRepository;
	
	
	@Autowired
	RestTemplate restTemplate; 
	
	
	
	public String createPhonePayAccount(PhonePay phonePay) {
		String emailid = phonePay.getEmailId();
	// we are calling account micro service using domain name or local host with port number. 				
	//int accnumber = restTemplate.getForObject("http://localhost:8383/account/findAccount/"+emailid, Integer.class);
	// using Eureka Server features we can call or communicate two micro service 
		// by service name rather than ip or domain with port number 
		
		int accnumber = restTemplate.getForObject("http://ACCOUNT-MICRO-SERVICE/account/findAccount/"+emailid, Integer.class);
		
		if(accnumber==0) {
			return "Phone Pay account didn't create becuase Bank account not exits with provided emailid as "+emailid;
		}else {
			phonePay.setAccno(accnumber);
			phonePayRepository.save(phonePay);
			return "Phone Pay account created successfully";
		}
		
	}
	
	public String findBalance(int ppid) {
		Optional<PhonePay> result = phonePayRepository.findById(ppid);
		if(result.isPresent()) {
			PhonePay phonePay = result.get();
			int accno = phonePay.getAccno();
	//		String info = restTemplate.getForObject("http://localhost:8383/account/findBalance/100", String.class);
			String info = restTemplate.getForObject("http://ACCOUNT-MICRO-SERVICE/account/findBalance/100", String.class);
			return "Fro Phone Pay Micro Service "+info;
		}else {
				return "Phone Pay Account not exits";
		}
		
		

	}
}