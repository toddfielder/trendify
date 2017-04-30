package com.fielder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fielder.model.Topic;
import com.fielder.model.projection.TopicCategoryView;

//@RepositoryRestResource(collectionResourceRel = "categories", path = "categories")
//@RepositoryRestResource(excerptProjection = TopicCategoryView.class)
public interface TopicJpaRepository extends JpaRepository<Topic, Integer> {

	//TopicCategoryView  findById(Integer firstName);
}
