package com.itaspirants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingWithSLF4JAndLog4j2 {
	public static void main(final String[] args) {
		Logger logger = LoggerFactory.getLogger(LoggingWithSLF4JAndLog4j2.class);
		// logger.info("Hello World !!");
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn message");
		// logger.fatal("This is fatal message");
		// logger.error("This is error message");
		System.out.println("Logic executed successfully....");
	}
}
