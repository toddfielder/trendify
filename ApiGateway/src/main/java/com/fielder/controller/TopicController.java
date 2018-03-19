package com.fielder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fielder.domain.Topic;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
@RequestMapping(value="/api/topic")
public class TopicController {
	@Autowired
	private EurekaClient eurekaClient;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Topic>> getTopics() {
		ResponseEntity<List<Topic>> response =
				restTemplate.exchange("http://topic/", HttpMethod.GET, null, new ParameterizedTypeReference<List<Topic>>(){});
		return response;		
	}
	
	@RequestMapping(value = "/{topicId}", method = RequestMethod.GET)
	public ResponseEntity<Topic> getTopicById(@PathVariable Integer topicId) {
//		RestTemplate restTemplate = restTemplateBuilder.build();
//		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("topic", false);		
//		String baseUrl = instanceInfo.getHomePageUrl();
		ResponseEntity<Topic> response =
				restTemplate.exchange("http://topic/" + topicId, HttpMethod.GET, null, new ParameterizedTypeReference<Topic>(){});
		return response;
	}
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public ResponseEntity<String> callService() {
		RestTemplate restTemplate = restTemplateBuilder.build();
		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("topic", false);
		
		String baseUrl = instanceInfo.getHomePageUrl();
		ResponseEntity<String> response = restTemplate.exchange(baseUrl + "/test", HttpMethod.GET, null, String.class);
		return response;
	}
}
