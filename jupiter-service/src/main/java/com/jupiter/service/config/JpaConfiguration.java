package com.jupiter.service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.jupiter.repository")
public class JpaConfiguration {

}
