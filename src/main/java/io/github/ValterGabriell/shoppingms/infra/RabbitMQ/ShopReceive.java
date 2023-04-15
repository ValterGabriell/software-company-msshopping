package io.github.ValterGabriell.shoppingms.infra.RabbitMQ;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ValterGabriell.shoppingms.domain.dto.RequestShop;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ShopReceive {

    @RabbitListener(queues = "shopping-queue")
    public void receiveShopRequest(@Payload String payload) throws JsonProcessingException {
        try {
            var mapper = new ObjectMapper();
            RequestShop cardData = mapper.readValue(payload, RequestShop.class);
            log.info("Sucesso ao receber solicitação de compra: {}", cardData);
        } catch (Exception e) {
            log.error("Erro ao receber solicitação de emissão de compra: {}", e.getMessage());
        }
    }
}
