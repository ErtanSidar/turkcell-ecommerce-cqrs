package com.turkcell.ecommerce.cqrs.application.order.command.update;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.domain.entity.OrderStatus;
import com.turkcell.ecommerce.cqrs.persistance.order.OrderRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class UpdateOrderCommand implements Command<UpdatedOrderResponse> {
    private UUID id;
    private OrderStatus status;

    @Component
    @RequiredArgsConstructor
    public static class UpdateOrderCommandHandler implements
            Command.Handler<UpdateOrderCommand, UpdatedOrderResponse> {

        private final OrderRepository orderRepository;

        @Override
        public UpdatedOrderResponse handle(UpdateOrderCommand updateOrderCommand) {
            return null;
        }
    }
}
