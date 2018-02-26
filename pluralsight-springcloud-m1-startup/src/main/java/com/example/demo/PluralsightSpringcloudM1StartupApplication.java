package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PluralsightSpringcloudM1StartupApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightSpringcloudM1StartupApplication.class, args);
	}
	

	@RequestMapping(value="/employee", method=RequestMethod.GET)
	public String sayEmployee() {
		return "alex fournier";
	}
		
	@RequestMapping(value="/greeting", method=RequestMethod.GET)
		public String sayGreeting() {
		return "hello world";
	
	}
}

