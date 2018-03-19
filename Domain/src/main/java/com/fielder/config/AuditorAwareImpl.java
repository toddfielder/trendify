package com.fielder.config;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

//https://dzone.com/articles/spring-data-jpa-auditing-automatically-the-good-stuff
//http://www.baeldung.com/database-auditing-jpa
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {    	
    	//change to spring security
        return Optional.of("tpfield");
    }
}