package com.fielder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fielder.model.Category;
import com.fielder.service.CategoryService;


@RestController
@RequestMapping(value="/api/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Category>> getCategories() {
	    return new ResponseEntity<List<Category>>(categoryService.getCategories(), HttpStatus.OK);
	}
	@RequestMapping(value = "/{catId}", method = RequestMethod.GET)
	public ResponseEntity<Category> getCategoryById(@PathVariable Integer catId) {
	    return new ResponseEntity<Category>(categoryService.getCategoryById(catId), HttpStatus.OK);
	}
	@RequestMapping(value = "/topics", method = RequestMethod.POST)
	public ResponseEntity<List<Category>> getCategoryWithTopics(@RequestBody List<Integer> topicIds) {
	    return new ResponseEntity<List<Category>>(categoryService.getCategories(), HttpStatus.OK);
	}
	
}
