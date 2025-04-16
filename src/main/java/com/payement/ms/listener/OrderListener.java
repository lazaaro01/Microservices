package com.payement.ms.listener;

import com.payement.ms.config.RabbitMQConfig;
import com.payement.ms.dto.OrderDTO;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class OrderListener {

    @RabbitListener(queues = RabbitMQConfig.QUEUE)
    public void receiveOrder(OrderDTO order) {
        System.out.println("\uD83D\uDCE6 Pedido recebido no payment-service:");
        System.out.println("-> ID:" + order.getOrderId());
        System.out.println("-> Produto: " + order.getProduct());
        System.out.println("-> Valor R$: " + order.getPrice());
        System.out.println("✅ Pagamento processado com sucesso!");
    }
}
