package io.proj3ct.springdemobot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TelegramSpringBotAppApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(TelegramSpringBotAppApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
