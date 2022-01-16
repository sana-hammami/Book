package com.codewithGAS.livre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}
//	@Bean
//	@LoadBalanced
//	 public RestTemplate restTemplate(){
//		return new RestTemplate();
//	}
}
