package com.fielder.task.intake;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.cloud.task.launcher.TaskLaunchRequest;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(Source.class)
public class TaskProcessor {
	
	@Autowired
	private Source source;
	
	public void publishRequest(String payload){
		String url = "maven://com.fielder.cloudtasktest:cloudtasktest-0.0.1-SNAPSHOT.jar:0.0.1-SNAPSHOT";		
		
		List<String> input = new ArrayList<>();		
		input.add("test");
		
		TaskLaunchRequest launchRequest = new TaskLaunchRequest(url, input, null, null, "TaskProcessor");
		
		System.out.println("----------launchRequest created----------");
		
		GenericMessage<TaskLaunchRequest> message = new GenericMessage<>(launchRequest);
		this.source.output().send(message);
	}
	
	
}


