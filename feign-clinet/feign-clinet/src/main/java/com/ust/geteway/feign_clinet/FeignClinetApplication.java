package com.ust.geteway.feign_clinet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClinetApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClinetApplication.class, args);
	}

}
