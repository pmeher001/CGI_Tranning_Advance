package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SecondMicroServiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondMicroServiesApplication.class, args);
		System.err.println("Second Micro Service Project running on port number 8181");
	}

}
