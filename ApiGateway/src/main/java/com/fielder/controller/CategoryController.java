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

import com.fielder.domain.Category;
import com.fielder.service.CategoryService;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
@RequestMapping(value="/api/category")
public class CategoryController {
	@Autowired
	private EurekaClient eurekaClient;
	
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Category>> getCategories() {
	    RestTemplate restTemplate = restTemplateBuilder.build();
		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("category", false);
		
		
		String baseUrl = instanceInfo.getHomePageUrl();
		ResponseEntity<List<Category>> response =
				restTemplate.exchange(baseUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<Category>>(){});
		return response;
	}
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public ResponseEntity<List<Category>> createCategory(Category cat) {
		System.out.println("API Gateway: " + cat.getTitle());
	    RestTemplate restTemplate = restTemplateBuilder.build();
		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("category", false);
		
		
		String baseUrl = instanceInfo.getHomePageUrl();
		ResponseEntity<List<Category>> response =
				restTemplate.exchange(baseUrl, HttpMethod.GET, null, new ParameterizedTypeReference<List<Category>>(){});
		return response;
	}
//	@RequestMapping(value = "/{catId}", method = RequestMethod.GET)
//	public ResponseEntity<Category> getCategoryById(@PathVariable Integer catId) {
//		RestTemplate restTemplate = restTemplateBuilder.build();
//		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("category", false);		
//		String baseUrl = instanceInfo.getHomePageUrl();
//		ResponseEntity<Category> response =
//				restTemplate.exchange(baseUrl + "/" + catId, HttpMethod.GET, null, new ParameterizedTypeReference<Category>(){});
//		return response;
//	}
	@RequestMapping(value = "/{catId}", method = RequestMethod.GET)
	public ResponseEntity<Category> getCategoryById(@PathVariable Integer catId) {		
		return categoryService.getCategoryById(catId);
	}
	
//	
//	@RequestMapping(value = "/test", method = RequestMethod.GET)
//	public ResponseEntity<String> callService() {
//		RestTemplate restTemplate = restTemplateBuilder.build();
//		InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("category", false);
//		
//		String baseUrl = instanceInfo.getHomePageUrl();
//		ResponseEntity<String> response = restTemplate.exchange(baseUrl + "/test", HttpMethod.GET, null, String.class);
//		return response;
//	}
}
