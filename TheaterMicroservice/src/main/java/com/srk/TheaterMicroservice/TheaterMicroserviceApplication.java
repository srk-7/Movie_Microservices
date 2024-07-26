package com.srk.TheaterMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TheaterMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheaterMicroserviceApplication.class, args);
	}

}