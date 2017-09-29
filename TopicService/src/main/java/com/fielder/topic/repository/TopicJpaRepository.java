package com.fielder.topic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fielder.domain.Topic;

//@RepositoryRestResource(collectionResourceRel = "categories", path = "categories")
//@RepositoryRestResource(excerptProjection = TopicCategoryView.class)
public interface TopicJpaRepository extends JpaRepository<Topic, Integer> {

	//TopicCategoryView  findById(Integer firstName);
}
