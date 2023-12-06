package com.college.pkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TsetApplication {

	public static void main(String[] args) {
		SpringApplication.run(TsetApplication.class, args);
	}
	
	@GetMapping("/test")
	public String test() {
		return "Hi its tomcat";
	}

}
