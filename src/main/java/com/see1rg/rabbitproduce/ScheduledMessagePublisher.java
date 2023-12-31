package com.see1rg.rabbitproduce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class ScheduledMessagePublisher {

    private final MQProducer producer;
    private final Logger logger = LoggerFactory.getLogger(ScheduledMessagePublisher.class);

    public ScheduledMessagePublisher(MQProducer producer) {
        this.producer = producer;
    }

    @Scheduled(fixedRate = 1000)
    public void publishRandomMessage() {
        String message = UUID.randomUUID().toString();
        producer.sendMessage(message);
        logger.info("Published message: {}", message);
    }
}

