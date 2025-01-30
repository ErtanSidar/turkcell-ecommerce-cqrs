package com.turkcell.ecommerce.cqrs.application.orderItem.command.create;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.domain.entity.BasketItem;
import com.turkcell.ecommerce.cqrs.persistance.orderItem.OrderItemRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
public class CreateOrderItemCommand implements Command<CreatedOrderItemResponse> {
    private int orderId;
    private List<BasketItem> basketItems;

    @Component
    @RequiredArgsConstructor
    public static class CreateOrderItemCommandHandler implements
            Command.Handler<CreateOrderItemCommand, CreatedOrderItemResponse> {

        private final OrderItemRepository orderItemRepository;

        @Override
        public CreatedOrderItemResponse handle(CreateOrderItemCommand createOrderItemCommand) {
            return null;
        }
    }
}
