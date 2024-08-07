package com.srk.MovieMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MovieMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieMicroserviceApplication.class, args);
	}

}