package com.fielder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fielder.domain.Topic;

@RestController
@RequestMapping(value="/api/topic")
public class TopicController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Topic>> getTopics() {
		ResponseEntity<List<Topic>> response =
				restTemplate.exchange("http://topic/", HttpMethod.GET, null, new ParameterizedTypeReference<List<Topic>>(){});
		return response;		
	}
	
	@RequestMapping(value = "/{topicId}", method = RequestMethod.GET)
	public ResponseEntity<Topic> getTopicById(@PathVariable Integer topicId) {
		ResponseEntity<Topic> response =
				restTemplate.exchange("http://topic/" + topicId, HttpMethod.GET, null, new ParameterizedTypeReference<Topic>(){});
		return response;
	}
	
}
