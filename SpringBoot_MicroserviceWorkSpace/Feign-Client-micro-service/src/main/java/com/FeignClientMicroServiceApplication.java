package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com") // Enable @Restcontroller and more 
@EnableDiscoveryClient    // to deploy on eureka server 
@EnableFeignClients			// Enable Feign client features 
public class FeignClientMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientMicroServiceApplication.class, args);
		System.err.println("Spring boot feign client up on port number 8585");
	}

}