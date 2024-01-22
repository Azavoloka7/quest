package com.zavoloka.quest.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("com.zavoloka.quest.model")  // Specify the package where your entities are located
@ComponentScan("com.zavoloka.quest")     // Specify the base package for component scanning
public class ApplicationConfig {
    // Your configuration settings
}
