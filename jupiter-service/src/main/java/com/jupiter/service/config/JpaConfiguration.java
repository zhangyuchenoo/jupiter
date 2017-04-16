package com.jupiter.service.config;

import javax.persistence.EntityManager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.jupiter.repository")
public class JpaConfiguration {

	@Bean
	public EntityManager entityManagerFactory() {
		return null;
	}
}
