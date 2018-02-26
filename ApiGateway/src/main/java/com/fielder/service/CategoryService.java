package com.fielder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.fielder.domain.Category;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CategoryService {
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getCategoryByIdFailed")
	public ResponseEntity<Category> getCategoryById(@PathVariable Integer catId) {		
		ResponseEntity<Category> response =
				restTemplate.exchange("http://category/" + catId, HttpMethod.GET, null, new ParameterizedTypeReference<Category>(){});
		return response;
	}
	public ResponseEntity<Category> getCategoryByIdFailed(Integer catId){
		System.out.println("---------------------getCategoryByIdFailed: " + catId + "-------------------------");
		return null;
	} 
	
	@HystrixCommand(fallbackMethod = "createCategoryFailed")
	public ResponseEntity<Category> createCategory(Category cat) {		
		ResponseEntity<Category> response =
				restTemplate.exchange("http://category/create", HttpMethod.POST, null, new ParameterizedTypeReference<Category>(){});
		return response;
	}
	public ResponseEntity<Category> createCategoryFailed(Category cat){
		System.out.println("---------------------createCategoryFailed: " + cat.getTitle() + "-------------------------");
		return null;
	} 
	
}
