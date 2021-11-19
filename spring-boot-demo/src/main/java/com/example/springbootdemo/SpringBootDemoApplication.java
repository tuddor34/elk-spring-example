package com.example.springbootdemo;

import com.example.springbootdemo.constant.AppConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringBootDemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
        MDC.put("id", AppConstant.PROJECT_NAME_PREFIX);
        log.info("---------- Spring Application started successfully ----------");
        log.debug("This is a debug message.");
        log.info("This is an info message.");
        log.warn("This is a warn message.");
        log.error("This is an error message.");
        log.info("---------- Spring Application ended successfully ----------");
    }

}
