package com.fielder.model.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.fielder.model.Topic;

@Projection(name="topicCategoryView", types={Topic.class})
public interface TopicCategoryView {
	String getTitle();	
	
	@Value("#{target.category.title}")
	String getCategoryName();
}
