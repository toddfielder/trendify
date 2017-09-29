package com.fielder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fielder.model.Category;

//@RepositoryRestResource(collectionResourceRel = "categories", path = "categories")
public interface CategoryJpaRepository extends JpaRepository<Category, Integer> {

}
