package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")  // Enable @Restcontroller, @Service, @Repository 
//@EntityScan(basePackages = "com.entity")  // Enable @Entity annotation 
//@EnableJpaRepositories(basePackages = "com.repository") // enable spring data features 
//@EnableDiscoveryClient
public class AccountMicroServiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMicroServiesApplication.class, args);
	}

}
