package com.rohitksingh.springbootjavabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    List<Topic> topics = Arrays.asList(
            new Topic(1, "Java", "Java 1.8"),
            new Topic(2, "Python", "Python 1.7"),
            new Topic(3, "Kotlin", "Kotlin"),
            new Topic(4, "Swift", "Swift replacing Obj-C")
            );

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(int id){
        return topics.stream().filter(t-> t.getId()==id).findFirst().get();
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }
}
