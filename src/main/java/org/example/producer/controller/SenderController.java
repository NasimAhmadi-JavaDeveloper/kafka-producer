package org.example.producer.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.example.producer.component.KafkaProducer;
import org.example.producer.model.RootDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sender")
public class SenderController {

    private final KafkaProducer producer;
    private final ObjectMapper mapper;

    @PostMapping
    public void send(RootDto dto) throws JsonProcessingException {
        producer.sendMessage(mapper.writeValueAsString(dto));
    }
}
