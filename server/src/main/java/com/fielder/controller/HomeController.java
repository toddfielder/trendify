package com.fielder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fielder.model.Category;
import com.fielder.service.CategoryService;

@RestController
public class HomeController {

	@Autowired
	private CategoryService categoryService;
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home() {
//	    return "index.html";
//	}
	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public ResponseEntity<List<Category>> getCategories() {
	    return new ResponseEntity<List<Category>>(categoryService.getCategories(), HttpStatus.OK);
	}
	
}
