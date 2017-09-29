package com.fielder.topic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fielder.domain.Topic;
import com.fielder.topic.service.TopicService;


@RestController
@RequestMapping
public class TopicController {
	@Value("${service.instance.name}")
	private String instance;	
	
	@Autowired
	private TopicService topicService;	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<Topic>> getTopics() {
	    return new ResponseEntity<List<Topic>>(topicService.getTopics(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{topicId}", method = RequestMethod.GET)
	public ResponseEntity<Topic> getTopicById(@PathVariable Integer topicId) {
	    return new ResponseEntity<Topic>(topicService.getTopicById(topicId), HttpStatus.OK);
	}
	
	@GetMapping("/test")
	public String message(){
		return "Hello from TopicService: "+ instance;
	}
}
