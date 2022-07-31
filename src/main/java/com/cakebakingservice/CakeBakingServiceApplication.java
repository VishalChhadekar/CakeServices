package com.cakebakingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class CakeBakingServiceApplication {

	public static void main(String[] args) {
		System.out.println("Program Initiated!");
		SpringApplication.run(CakeBakingServiceApplication.class, args);
	}

}
