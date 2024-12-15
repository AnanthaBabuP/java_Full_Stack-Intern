package com.web.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.web.*")
public class NetfixCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetfixCloneApplication.class, args);
	}

}
