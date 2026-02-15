package com.kodewala.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServicesDay1EurekaServerSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesDay1EurekaServerSampleApplication.class, args);
	}

}
