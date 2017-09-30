package com.fielder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

@SpringBootApplication
@EnableDiscoveryClient
//@EnableZuulProxy
@EnableCircuitBreaker
public class ApiGateway {

	public static void main(String[] args) {
		SpringApplication.run(ApiGateway.class, args);
	}
	
	@Bean
	public Module hibernate4Module()
	{
	    return new Hibernate4Module();
	}
	
//	@Bean
//	public AddRequestHeaderFilter addRequestHeaderfilter()
//	{
//	    return new AddRequestHeaderFilter();
//	}
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

}
