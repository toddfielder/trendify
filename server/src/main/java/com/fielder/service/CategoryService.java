package com.fielder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fielder.model.Category;
import com.fielder.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> getCategories() {
		List<Category> categories = categoryRepository.findAll();
		
	    return categories;
	}
	
	
}
