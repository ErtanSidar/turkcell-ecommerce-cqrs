package com.turkcell.ecommerce.cqrs.application.orderItem.command.delete;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.orderItem.OrderItemRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class DeleteOrderItemCommand implements Command<DeletedOrderItemResponse> {
    private UUID id;

    @Component
    @RequiredArgsConstructor
    public static class DeleteOrderItemCommandHandler implements
            Command.Handler<DeleteOrderItemCommand, DeletedOrderItemResponse> {

        private final OrderItemRepository orderItemRepository;

        @Override
        public DeletedOrderItemResponse handle(DeleteOrderItemCommand deleteOrderItemCommand) {
            return null;
        }
    }
}
