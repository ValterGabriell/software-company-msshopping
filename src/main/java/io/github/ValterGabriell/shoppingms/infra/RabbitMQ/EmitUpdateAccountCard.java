package io.github.ValterGabriell.shoppingms.infra.RabbitMQ;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ValterGabriell.shoppingms.application.domain.dto.NewAccountCardLimit;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class EmitUpdateAccountCard {
    private final RabbitTemplate rabbitTemplate;
    private final Queue queue;


    public void updateAccountCard(NewAccountCardLimit newAccountCardLimit) {
        try {
            log.info(newAccountCardLimit.toString());
            var json = convertToJsonString(newAccountCardLimit);
            rabbitTemplate.convertAndSend(queue.getName(), json);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }

    private String convertToJsonString(NewAccountCardLimit newAccountCardLimit) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(newAccountCardLimit);
    }

}
