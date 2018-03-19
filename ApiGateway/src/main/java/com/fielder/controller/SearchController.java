package com.fielder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fielder.domain.Category;
import com.fielder.model.search.SearchableCategory;
import com.fielder.repository.CategoryRepository;
import com.fielder.service.CategoryService;

@RestController
public class SearchController {
	
	@Autowired 
	private CategoryRepository categoryRepository;
	
	@Autowired 
	private CategoryService categoryService;
	
	@RequestMapping(value = "/search/index", method = RequestMethod.GET)
	public String indexAll() {
		
		ResponseEntity<List<Category>> categories = categoryService.getCategories();
		for(Category c : categories.getBody()){
			SearchableCategory sc = new SearchableCategory(c);
			categoryRepository.save(sc);
		}
		
	    return "success";
	}
	
	@RequestMapping(value = "/search/delete", method = RequestMethod.GET)
	public String deleteAll() {
		
		categoryRepository.deleteAll();
		
	    return "success";
	}
}
