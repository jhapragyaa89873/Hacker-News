package com.hackerNews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


/**
 * Main class for the application
 * 
 * @author Pragya Jha
 */
@SpringBootApplication
@EnableCaching
public class HackerNewsApiServerApplication {

	/**
	 * main method for starting the application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(HackerNewsApiServerApplication.class, args);
	}

}
