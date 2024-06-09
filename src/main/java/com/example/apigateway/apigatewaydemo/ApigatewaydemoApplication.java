package com.example.apigateway.apigatewaydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class ApigatewaydemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApigatewaydemoApplication.class, args);
	}
	@RequestMapping(value = "/")
	public String home() {
		return "Eureka Client application";
	}

}
