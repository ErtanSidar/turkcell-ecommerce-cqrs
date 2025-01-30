package com.turkcell.ecommerce.cqrs.application.orderItem.command.update;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.orderItem.OrderItemRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class UpdateOrderItemCommand implements Command<UpdatedOrderItemResponse> {
    private UUID id;

    @Component
    @RequiredArgsConstructor
    public static class UpdateOrderItemCommandHandler implements
            Command.Handler<UpdateOrderItemCommand, UpdatedOrderItemResponse> {

        private final OrderItemRepository orderItemRepository;

        @Override
        public UpdatedOrderItemResponse handle(UpdateOrderItemCommand updateOrderItemCommand) {
            return null;
        }
    }
}
