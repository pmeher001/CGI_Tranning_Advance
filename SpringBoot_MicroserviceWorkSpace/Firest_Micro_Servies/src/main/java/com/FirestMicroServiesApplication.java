package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")  // Enable @Restcontroller
//@EnableDiscoveryClient	// this annotation deploy this micro service project on eureka server 
public class FirestMicroServiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirestMicroServiesApplication.class, args);
		System.err.println("First Micro Service Project running on port number 8181");
	}

}
