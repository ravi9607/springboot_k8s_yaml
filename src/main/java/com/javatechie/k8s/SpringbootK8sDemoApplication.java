package com.javatechie.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sDemoApplication {

	@GetMapping("/message")
	public String displayMessage(){
		return "Testing Java project in EC2 Instance... ";
	}
	@GetMapping("/msg")
	public String displayMessage1(){
		return "Testing Java project message22222222222 ";
	}
	@GetMapping("/msg1")
	public String displayMessage2(){
		return "Testing Java project message11111111111111111111111111111 ";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sDemoApplication.class, args);
	}

}
