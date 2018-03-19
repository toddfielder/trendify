package com.fielder.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fielder.category.repository.CategoryJpaRepository;
import com.fielder.domain.Category;

@Service
public class CategoryService {

	@Autowired
	private CategoryJpaRepository categoryRepository;
	
	public List<Category> getCategories() {
		List<Category> categories = categoryRepository.findAll();
		
	    return categories;
	}
	//FIXME fix categoryRepository.findOne(catId);
	public Category getCategoryById(Integer catId) {
		//Category category = categoryRepository.findOne(catId);
		//System.out.println("desc: " + category.getTopics().get(0).getDescription());
		return null;
	}
	
	
}
