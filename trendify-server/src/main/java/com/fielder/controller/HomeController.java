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
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<List<Category>> home() {
	    return new ResponseEntity<List<Category>>(categoryService.getCategories(), HttpStatus.OK);
	}
	
	
}
