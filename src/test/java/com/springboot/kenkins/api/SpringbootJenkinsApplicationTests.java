package com.springboot.kenkins.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class SpringbootJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsApplicationTests.class);
	
	@Test
	public void contextLoads() {
		logger.info("Test case Executing....");
		assertEquals(true, true);
	}

}
