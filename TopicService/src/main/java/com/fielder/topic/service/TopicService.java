package com.fielder.topic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fielder.domain.Topic;
import com.fielder.topic.repository.TopicJpaRepository;

@Service
public class TopicService {

	@Autowired
	private TopicJpaRepository topicRepository;
	
	public List<Topic> getTopics() {
		List<Topic> topics = topicRepository.findAll();
		
	    return topics;
	}

	//TODO: fix topicRepository.findOne(topicId);
	public Topic getTopicById(Integer topicId) {
		Optional<Topic> topic = topicRepository.findById(topicId);
		//System.out.println("desc: " + topic.getCategory().getDescription());
		//System.out.println("text: " + topic.getComments().get(0).getText());
		return topic.get();
	}	
}
