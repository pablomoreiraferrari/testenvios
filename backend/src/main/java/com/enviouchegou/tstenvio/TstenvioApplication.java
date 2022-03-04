package com.enviouchegou.tstenvio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = {"com.enviouchegou.tstenvio.entities"})

@EnableJpaRepositories(basePackages = {
        "com.enviouchegou.tstenvio.repositories"
        })

public class TstenvioApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TstenvioApplication.class, args);
	}

}
