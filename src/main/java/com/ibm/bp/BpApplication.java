package com.ibm.bp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.ibm.bp.model.entity"})
@EnableJpaRepositories(basePackages = {"com.ibm.bp.repository"})
public class BpApplication {
	public static void main(String[] args) {
		SpringApplication.run(BpApplication.class, args);
	}
}
