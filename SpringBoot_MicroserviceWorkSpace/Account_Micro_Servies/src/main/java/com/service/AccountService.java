package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Account;
import com.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	
	public String createAccount(Account account) {
		Optional<Account> result = accountRepository.findById(account.getAccno());
		if(result.isPresent()) {
			return "Account Number must be unique";
		}else {
			accountRepository.save(account);
			return "Account created successfully";
		}
	}
	
	public String findAccountBalance(int accno) {
		Optional<Account> result = accountRepository.findById(accno);
		if(result.isPresent()) {
			Account accountDetailsFromDb  = result.get();
			return "Your balance amount is "+accountDetailsFromDb.getAmount(); 
		}else {
			return "Account not exists";
		}
	}
	
	public int findAccountNumbre(String emailId) {
		try {
		return accountRepository.findAccoutNumberUsingEmailId(emailId);
		}catch(Exception e) {
			System.err.println(e);
			return 0;
		}
	}
	
}

