package com.turkcell.ecommerce.cqrs.application.order.command.create;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.order.OrderRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class CreateOrderCommand implements Command<CreatedOrderResponse> {
    private UUID basketId;

    @Component
    @RequiredArgsConstructor
    public static class CreateOrderCommandHandler implements
            Command.Handler<CreateOrderCommand, CreatedOrderResponse> {

        private final OrderRepository orderRepository;

        @Override
        public CreatedOrderResponse handle(CreateOrderCommand createOrderCommand) {
            return null;
        }
    }
}
