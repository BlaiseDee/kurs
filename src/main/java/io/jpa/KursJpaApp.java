package io.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:config.properties")

@SpringBootApplication
public class KursJpaApp {

    public static void main(String[] args) {
        SpringApplication.run(KursJpaApp.class, args);
    }



}
