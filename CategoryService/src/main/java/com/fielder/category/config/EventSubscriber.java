package com.fielder.category.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fielder.domain.Category;

public class EventSubscriber {

  private Logger logger = LoggerFactory.getLogger(EventSubscriber.class);

  public void receive(String message) {
    logger.info("Received message '{}'", message);
  }


}
