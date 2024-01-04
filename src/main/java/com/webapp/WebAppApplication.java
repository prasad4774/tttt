package com.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebAppApplication {

	public static void main(String[] args) {
		
		System.out.println("this is web Application");
		SpringApplication.run(WebAppApplication.class, args);
	}

}
