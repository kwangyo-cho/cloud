/*
 * # UserApiApplication.java
 *
 * KwangyoCho., Software License, Version 1.0
 * Copyright (c) 2018 Kwangyo Cho., All rights reserved.
 *
 * For more information on this product, please see
 * https://www.kkazo.net
 */
package net.kkazo.prototype.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Cloud Discovery
 *
 * @author ky.cho
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableSwagger2
public class UserApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Bean
	public Docket swaggerApi() {
		return new Docket(DocumentationType.SWAGGER_2)
			.select()
			.apis(RequestHandlerSelectors.basePackage("net.kkazo.api.gateway.controller"))
			.paths(PathSelectors.any())
			.build()
			.apiInfo(
				new ApiInfoBuilder()
					.version("1.0")
					.title("User API")
					.description("Documentation User API v1.0").build());
	}

}


