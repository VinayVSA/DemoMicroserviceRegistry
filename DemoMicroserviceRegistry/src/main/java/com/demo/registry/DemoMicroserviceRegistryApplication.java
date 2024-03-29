package com.demo.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoMicroserviceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMicroserviceRegistryApplication.class, args);
	}

}
