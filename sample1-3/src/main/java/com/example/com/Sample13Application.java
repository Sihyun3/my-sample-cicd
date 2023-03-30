package com.example.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Sample13Application {

	public static void main(String[] args) {
		SpringApplication.run(Sample13Application.class, args);
	}
	
	@GetMapping("/hello")
	public String Hello() {
		return "<h1>Hello</h1>";
	}

}
