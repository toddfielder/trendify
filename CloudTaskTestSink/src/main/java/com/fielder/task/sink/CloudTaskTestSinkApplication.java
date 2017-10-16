package com.fielder.task.sink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class CloudTaskTestSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudTaskTestSinkApplication.class, args);
	}
}
