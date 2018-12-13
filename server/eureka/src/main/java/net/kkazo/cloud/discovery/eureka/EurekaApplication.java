/*
 * # EurekaApplication.java
 *
 * KwangyoCho., Software License, Version 1.0
 * Copyright (c) 2018 Kwangyo Cho., All rights reserved.
 *
 * For more information on this product, please see
 * https://www.kkazo.net
 */

package net.kkazo.cloud.discovery.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Cloud Discovery
 *
 * @author ky.cho
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}
}
