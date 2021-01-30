package com.rohitksingh.springbootjavabrains;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics(){
        List<Topic> topics = new ArrayList<>();
        topics.add(new Topic("1", "Java", "Java 1.8"));
        topics.add(new Topic("2", "Python", "Python 1.7"));
        topics.add(new Topic("3", "Kotlin", "Kotlin"));
        topics.add(new Topic("4", "Swift", "Swift replacing Obj-C"));
        return topics;
    }

    public List<Topic> getAllTopics(){
        return topics();
    }
}
