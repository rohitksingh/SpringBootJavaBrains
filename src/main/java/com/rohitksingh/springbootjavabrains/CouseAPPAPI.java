package com.rohitksingh.springbootjavabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CouseAPPAPI {

    @Autowired
    private static TopicService topicService;

    public static void main(String[] args) {
        SpringApplication.run(CouseAPPAPI.class, args);
    }
}
