package com.rohitksingh.springbootjavabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
        Topic topic =null;
        return topic = (topicRepository.findById(id)!=null) ? topic : null;
    }

    public void addTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void deleteTopic(Topic topic){
        topicRepository.delete(topic);
    }

    public void deleteAllTopics(){
        topicRepository.deleteAll();
    }

}
