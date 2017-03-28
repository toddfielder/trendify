package com.fielder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fielder.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
