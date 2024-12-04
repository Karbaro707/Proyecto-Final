package com.banco.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicoEurekApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicoEurekApplication.class, args);
	}

}
