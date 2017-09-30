package com.fielder.category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fielder.category.service.CategoryService;
import com.fielder.domain.Category;

@RestController
@RequestMapping
public class CategoryController {
	@Value("${service.instance.name}")
	private String instance;
	
	@Autowired
	private CategoryService categoryService;	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<Category>> getCategories() {		
		System.out.println("-------------getCategories-------------");
	    return new ResponseEntity<List<Category>>(categoryService.getCategories(), HttpStatus.OK);
	}
	@RequestMapping(value = "/{catId}", method = RequestMethod.GET)
	public ResponseEntity<Category> getCategoryById(@PathVariable Integer catId) {
	    return new ResponseEntity<Category>(categoryService.getCategoryById(catId), HttpStatus.OK);
	}

	@GetMapping("/test")
	public String message(@RequestHeader("x-location") String location){
		return "Hello from CategoryService: "+ instance + " from: " + location;
	}
}
