package io.github.ValterGabriell.shoppingms.infra.RabbitMQ;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.ValterGabriell.shoppingms.application.ShopService;
import io.github.ValterGabriell.shoppingms.application.domain.dto.NewAccountCardLimit;
import io.github.ValterGabriell.shoppingms.application.domain.dto.BuyRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ShopReceive {

    private final ShopService service;
    private final EmitUpdateAccountCard emitUpdateAccountCard;

    @RabbitListener(queues = "purchase-queue")
    public void receiveShopRequest(@Payload String payload) throws JsonProcessingException {
        try {
            log.info(payload);
            var mapper = new ObjectMapper();
            BuyRequest buyRequest = mapper.readValue(payload, BuyRequest.class);
            NewAccountCardLimit newAccountCardLimit = service.shopSomething(buyRequest);
            emitUpdateAccountCard.updateAccountCard(newAccountCardLimit);
        } catch (Exception e) {
            log.error("Erro ao receber solicitação de emissão de compra: {}", e.getMessage());
        }
    }
}
