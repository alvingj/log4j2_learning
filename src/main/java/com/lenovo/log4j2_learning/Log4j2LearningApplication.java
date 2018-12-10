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
        logger.trace("I am {} log.","trace");
        logger.debug("I am {} log.","debug");
        logger.info("I am {} log.","info");
        logger.warn("I am {} log.","warn");
        logger.error("I am {} log.","error");
    }
}
