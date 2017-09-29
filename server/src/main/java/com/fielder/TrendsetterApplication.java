package com.fielder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

@SpringBootApplication
@EnableDiscoveryClient
public class TrendsetterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrendsetterApplication.class, args);
	}
	
	@Bean
	public Module hibernate4Module()
	{
	    return new Hibernate4Module();
	}
	
	

}
