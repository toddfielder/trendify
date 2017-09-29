package com.fielder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fielder.model.Category;
import com.fielder.repository.CategoryJpaRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryJpaRepository categoryRepository;
	
	public List<Category> getCategories() {
		List<Category> categories = categoryRepository.findAll();
		
	    return categories;
	}

	public Category getCategoryById(Integer catId) {
		Category category = categoryRepository.findOne(catId);
		System.out.println("desc: " + category.getTopics().get(0).getDescription());
		return category;
	}
	
	
}
