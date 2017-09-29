package com.fielder.category.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fielder.domain.Category;

//@RepositoryRestResource(collectionResourceRel = "categories", path = "categories")
public interface CategoryJpaRepository extends JpaRepository<Category, Integer> {

}
