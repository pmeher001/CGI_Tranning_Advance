package com.controller;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("kafka")
public class KafkaProducerController {

	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	@GetMapping(value = "send/{msg}")
	public String sendMessageToKafka(@PathVariable("msg") String msg) throws Exception{
		CompletableFuture<SendResult<String,String>> ff= kafkaTemplate.send("mytopic", msg);
		return ff.get().toString();
		//kafkaTemplate.send("mytopic", msg);
		//return "done";
			
	}
}
