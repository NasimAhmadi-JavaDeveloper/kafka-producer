package org.example.producer.component;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${topic.name.sender}")
    private String topicName;

    public void sendMessage(String message) {
        kafkaTemplate.send(topicName, message);
        log.info("{} sent Successfully to the Kafka topic: {}", message, topicName);
    }
}
