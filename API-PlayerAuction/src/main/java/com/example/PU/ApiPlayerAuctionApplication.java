package com.example.PU;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiPlayerAuctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPlayerAuctionApplication.class, args);
	}

}
