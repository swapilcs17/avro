package com.example.kafka.controller;

import com.example.kafka.producer.Sender;
import example.avro.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvroController {

    @Autowired
    Sender sender;

    @GetMapping("/avro")
    public void sendAvro() {
        User user = User.newBuilder().setName("John Doe").setFavoriteColor("green")
                .setFavoriteNumber(null).build();
        sender.send(user);
    }
}
