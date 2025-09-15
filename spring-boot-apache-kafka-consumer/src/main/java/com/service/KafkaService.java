package com.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

	@KafkaListener(topics = "mytopic",groupId = "my-group")
	public void consumeKafkaMessage(@Payload String message) {
		System.err.println(message);
	}
}
