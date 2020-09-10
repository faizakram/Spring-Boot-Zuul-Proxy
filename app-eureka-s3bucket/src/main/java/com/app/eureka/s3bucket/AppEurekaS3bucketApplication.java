package com.app.eureka.s3bucket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class AppEurekaS3bucketApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppEurekaS3bucketApplication.class, args);
	}

}
