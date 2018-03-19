package com.fielder.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.fielder.model.search.SearchableCategory;

public interface CategoryRepository extends ElasticsearchRepository<SearchableCategory, String> {

}
 