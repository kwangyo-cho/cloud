/*
 * # GatewayApplication.java
 *
 * KwangyoCho., Software License, Version 1.0
 * Copyright (c) 2018 Kwangyo Cho., All rights reserved.
 *
 * For more information on this product, please see
 * https://www.kkazo.net
 */
package net.kkazo.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Cloud Discovery
 *
 * @author ky.cho
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableSwagger2
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
			.route("user-route", r -> r
				.path("/users")
				.uri("lb://api-user")
			)
			.build();
	}
}


