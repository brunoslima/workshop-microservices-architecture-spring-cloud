package com.workshopeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication //Reconhece o projeto como uma aplicação Spring Boot
@EnableEurekaServer //Reconhece que a aplicação é um Service Registry Eureka
public class WorkshopEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopEurekaServerApplication.class, args);
	}

}

