package com.kb.claim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClaimserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClaimserviceApplication.class, args);
	}
}
