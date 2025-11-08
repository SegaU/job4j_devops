package ru.job4j.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring Boot application class for the Calculator application.
 * This application provides REST API endpoints for basic arithmetic operations.
 *
 * @author job4j
 * @version 1.0.0
 */
@SpringBootApplication
public class CalcApplication {

	/**
	 * Main method to start the Spring Boot application.
	 *
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(CalcApplication.class, args);
	}
}
