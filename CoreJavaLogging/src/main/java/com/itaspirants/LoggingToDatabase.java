package com.itaspirants;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class LoggingToDatabase {
	/* Get actual class name to be printed on */
	   static Logger log = Logger.getLogger(LoggingToDatabase.class.getName());
	   
	   public static void main(String[] args)throws IOException,SQLException{
	      log.debug("Debug message to database");
	      log.info("Info message to database");
	      System.out.println("abc");
	   }
}
