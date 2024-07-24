package com.example.jdbc_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JdbcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JdbcDemoApplication.class, args);
		System.out.println("Number of beans: ");
		SpringApplication.run(JdbcDemoApplication.class, args);
	}

}
