package com.see1rg.rabbitproduce;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class MQProducer {

    private final RabbitTemplate rabbitTemplate;
    private final Logger logger = LoggerFactory.getLogger(MQProducer.class);

    public MQProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }


    public void sendMessage(String message) {
        logger.info("Published message: {}", message);
        this.rabbitTemplate.convertAndSend(MQConfig.EXCHANGE, "", message);
    }
}
