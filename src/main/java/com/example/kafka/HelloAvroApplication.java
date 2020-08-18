package com.example.kafka;

import com.example.kafka.producer.Sender;
import example.avro.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloAvroApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloAvroApplication.class, args);
	}

}
