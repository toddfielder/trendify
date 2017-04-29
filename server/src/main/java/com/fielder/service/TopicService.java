package com.fielder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fielder.model.Topic;
import com.fielder.repository.TopicJpaRepository;

@Service
public class TopicService {

	@Autowired
	private TopicJpaRepository topicRepository;
	
	public List<Topic> getTopics() {
		List<Topic> topics = topicRepository.findAll();
		
	    return topics;
	}

	public Topic getTopicById(Integer topicId) {
		Topic topic = topicRepository.findOne(topicId);
		System.out.println("desc: " + topic.getCategory().getDescription());
		return topic;
	}
	
	
}
