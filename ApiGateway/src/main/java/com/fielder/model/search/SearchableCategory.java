package com.fielder.model.search;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.fielder.domain.Category;

@Document(indexName = "categories", type = "category")
public class SearchableCategory {
	@Id
	private Integer id;	
	private String title;	
	private String description;
	
	public SearchableCategory(){}
	public SearchableCategory(Category cat){
		this.title = cat.getTitle();
		this.description = cat.getDescription();
	}	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
