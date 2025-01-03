package com.findroute.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class FindRouteServerRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindRouteServerRegistryApplication.class, args);
	}

}
