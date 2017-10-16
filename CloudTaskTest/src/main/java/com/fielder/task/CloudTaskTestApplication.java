package com.fielder.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class CloudTaskTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTaskTestApplication.class, args);
	}
	
	@Bean
	public TestTask testTask(){
		return new TestTask();
	}
	
	public class TestTask implements CommandLineRunner{

		@Override
		public void run(String... arg0) throws Exception {
			System.out.println("---------------TestTask----------------");
			if(arg0 != null){
				System.out.println("argo: " + arg0.length);
			}			
		}		
	}
}
