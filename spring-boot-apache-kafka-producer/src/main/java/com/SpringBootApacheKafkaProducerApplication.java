package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootApacheKafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApacheKafkaProducerApplication.class, args);
		System.out.println("kafka Producer application up! on port number 8282");
	}

}