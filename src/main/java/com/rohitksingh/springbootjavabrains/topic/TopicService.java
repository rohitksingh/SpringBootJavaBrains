package com.rohitksingh.springbootjavabrains.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

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
