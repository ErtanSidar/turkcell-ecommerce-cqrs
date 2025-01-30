package com.turkcell.ecommerce.cqrs.application.order.command.delete;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.order.OrderRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class DeleteOrderCommand implements Command<DeletedOrderResponse> {
    private UUID id;

    @Component
    @RequiredArgsConstructor
    public static class DeleteOrderCommandHandler implements
            Command.Handler<DeleteOrderCommand, DeletedOrderResponse> {

        private final OrderRepository orderRepository;

        @Override
        public DeletedOrderResponse handle(DeleteOrderCommand deleteOrderCommand) {
            return null;
        }
    }
}
