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

import com.fielder.domain.Category;
import com.fielder.service.CategoryService;

@RestController
@RequestMapping(value="/api/category")
public class CategoryController {
		
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ResponseEntity<List<Category>> getCategories() {
		return categoryService.getCategories();
	}
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<Category> createCategory(@RequestBody Category cat) {
		ResponseEntity<Category> resp = categoryService.createCategory(cat);
		return new ResponseEntity<Category>(resp.getBody(), HttpStatus.OK);
	}
	@RequestMapping(value = "/{catId}", method = RequestMethod.GET)
	public ResponseEntity<Category> getCategoryById(@PathVariable Integer catId) {		
		return categoryService.getCategoryById(catId);
	}
}
