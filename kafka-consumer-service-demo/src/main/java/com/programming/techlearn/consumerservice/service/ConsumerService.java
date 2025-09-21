package com.programming.techlearn.consumerservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

     @KafkaListener(topics = "Test1", groupId = "test-service")

    // Method
    public void
    consume(String message)
    {
        // Print statement
        System.out.println("message = " + message);
    }

}
