package com.lenovo.log4j2_learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4j2LearningApplication {

    private static Logger logger = LoggerFactory.getLogger(Log4j2LearningApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(Log4j2LearningApplication.class, args);
        logger.trace("I am trace log.");
        logger.debug("I am debug log.");
        logger.info("I am info log.");
        logger.warn("I am warn log.");
        logger.error("I am error log.");
    }
}
