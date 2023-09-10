package com.see1rg.rabbitproduce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class RabbitProduceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitProduceApplication.class, args);
    }

}