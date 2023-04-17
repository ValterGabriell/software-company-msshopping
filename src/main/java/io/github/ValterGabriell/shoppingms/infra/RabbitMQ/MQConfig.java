package io.github.ValterGabriell.shoppingms.infra.RabbitMQ;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig {
    @Bean
    public Queue createQueue() {
        String queue = "update-account-card";
        return new Queue(queue, true);
    }
}
