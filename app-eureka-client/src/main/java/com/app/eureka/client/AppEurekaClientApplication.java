package com.app.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class AppEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppEurekaClientApplication.class, args);
	}

}
