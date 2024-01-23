package com.zavoloka.quest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.zavoloka.quest")
@EnableJpaRepositories("com.zavoloka.quest.repository")
public class ZavolokaQuestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZavolokaQuestApplication.class, args);
    }
}
