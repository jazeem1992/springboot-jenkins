package com.springboot.kenkins.api;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJenkinsApplication {
	
	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsApplication.class);
	
	@PostConstruct
	public void welcome() {
		logger.info("Application Started!!!!");
	}
	
	
	public static void main(String[] args) {
		logger.info("Application Executed!!!!");
		SpringApplication.run(SpringbootJenkinsApplication.class, args);
	}

}
