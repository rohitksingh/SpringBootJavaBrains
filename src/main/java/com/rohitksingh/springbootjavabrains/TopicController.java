package com.rohitksingh.springbootjavabrains;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){

        List<Topic> topics = new ArrayList<>();
        topics.add(new Topic("1", "Java", "Java 1.8"));
        topics.add(new Topic("2", "Python", "Python 1.7"));
        topics.add(new Topic("3", "Kotlin", "Kotlin"));
        topics.add(new Topic("4", "Swift", "Swift replacing Obj-C"));

        return topics;
    }
}
