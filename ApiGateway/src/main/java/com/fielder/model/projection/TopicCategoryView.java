package com.fielder.model.projection;

import org.springframework.beans.factory.annotation.Value;

//@Projection(name="topicCategoryView", types={Topic.class})
public interface TopicCategoryView {
	String getTitle();	
	
	@Value("#{target.category.title}")
	String getCategoryName();
	
	String getId();
}
