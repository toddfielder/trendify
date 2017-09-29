package com.fielder.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TrendsetterDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrendsetterDiscoveryServerApplication.class, args);
	}
}
