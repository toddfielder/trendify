//package com.fielder.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
//import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
//
//import com.fielder.model.Category;
//
//@Configuration
//public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
//    
//	@Override
//    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//        config.exposeIdsFor(Category.class);
//    }
//}