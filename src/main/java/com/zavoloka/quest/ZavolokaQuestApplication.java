package com.zavoloka.quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan("com.zavoloka.quest.model")
public class ZavolokaQuestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZavolokaQuestApplication.class, args);
    }
}