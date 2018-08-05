package com.l2d.tuto.springbootwebfluxsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
@EnableReactiveMongoRepositories
public class SpringBootWebfluxSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebfluxSecurityApplication.class, args);
	}
}
