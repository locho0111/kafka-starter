package com.rick.springbootkafkaproject.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import com.rick.springbootkafkaproject.payload.User;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "${spring.kafka.topic-json.name}",
            groupId = "${spring.kafka.consumer.group-id}")
    public void consume(User user) {
        LOGGER.info(String.format("User data received -> %s", user.toString()));
    }
}
