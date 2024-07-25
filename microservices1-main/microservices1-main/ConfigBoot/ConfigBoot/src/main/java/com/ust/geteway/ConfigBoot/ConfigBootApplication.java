package com.ust.geteway.ConfigBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigBootApplication.class, args);
	}

}
