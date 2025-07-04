package com.ironbucket.buzzlevane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryApp {
	public static void main(String[] args) {
		SpringApplication.run(DiscoveryApp.class, args);
	}
}
