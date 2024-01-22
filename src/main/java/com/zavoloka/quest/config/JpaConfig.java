package com.zavoloka.quest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.zavoloka.quest.repository")
public class JpaConfig  {
    // Your JPA configuration settings
}
