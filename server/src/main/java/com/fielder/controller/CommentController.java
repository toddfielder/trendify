package com.fielder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fielder.model.Topic;
import com.fielder.service.TopicService;


@RestController
@RequestMapping(value="/api/comment")
public class CommentController {
	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Topic>> getTopics() {
	    return new ResponseEntity<List<Topic>>(topicService.getTopics(), HttpStatus.OK);
	}
	
}
