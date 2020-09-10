package com.app.eureka.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AppEurekaUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppEurekaUserApplication.class, args);
	}

}
