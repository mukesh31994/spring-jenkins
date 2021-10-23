package com.java.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	
	@Test
	void contextLoads() {
		logger.info("Test case executing......");
		logger.info("Second Test case executing......");
		logger.info("Third Test case executing......");
		logger.info("Fourth Test case executing......");
		logger.info("5th Test case executing......");
		logger.info("6th Test case executing......");
		logger.info("7th Test case executing......");
		logger.info("8th Test case executing......");
		assertEquals(true, true);
	}

}
