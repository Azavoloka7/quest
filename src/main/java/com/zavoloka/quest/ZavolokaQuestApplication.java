package com.zavoloka.quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan ("com.zavoloka.quest.model")
@EnableJpaRepositories("com.zavoloka.quest.repository")
public class ZavolokaQuestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZavolokaQuestApplication.class, args);
    }
}
