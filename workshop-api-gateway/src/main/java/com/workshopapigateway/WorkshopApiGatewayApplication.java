package com.workshopapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class WorkshopApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(WorkshopApiGatewayApplication.class, args);
	}

	/*
	//Código funcional, foi comentado, pois está utilizando o arquivo de configuração para rotas
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("path_route", r->r.path ("/products").and().method("POST")
						.uri("http://localhost:9001"))
				.route("path_route", r->r.path ("/products/**").and().method("GET")
						.uri("http://localhost:9001"))
				.route("path_route", r->r.path ("/carts").and().method("POST")
						.uri("http://localhost:9002"))
				.route("path_route", r->r.path ("/carts/**").and().method("GET")
						.uri("http://localhost:9002"))
				.build();
	}
	*/

}
