package com.fielder.task.intake;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public TaskProcessor taskProcessor(){
		return new TaskProcessor();
	}
}
