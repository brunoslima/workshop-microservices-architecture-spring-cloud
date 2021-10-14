package com.workshop.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication //Reconhece o projeto como uma aplicação Spring Boot
@EnableConfigServer //Reconhece que a aplicação é um Config Server
public class WorkshopConfigServerApplication { //Classe central utilizada para subir o Config Server

	public static void main(String[] args) {
		SpringApplication.run(WorkshopConfigServerApplication.class, args);
	}

}

