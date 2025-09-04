package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com")  // enable @RestController, @service, @repository 
@EntityScan(basePackages = "com.entity")   // enable @Entity 
@EnableJpaRepositories(basePackages = "com.repository") // enable jpa features 
@EnableDiscoveryClient
public class PhonePayMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhonePayMicroServiceApplication.class, args);
	}

	@Bean
	public RestTemplate createRestTemplateObject() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
}