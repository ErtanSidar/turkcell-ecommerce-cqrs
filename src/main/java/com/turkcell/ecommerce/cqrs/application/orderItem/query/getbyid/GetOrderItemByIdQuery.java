package com.turkcell.ecommerce.cqrs.application.orderItem.query.getbyid;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.orderItem.OrderItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

public class GetOrderItemByIdQuery implements Command<GetOrderItemByIdResponse> {

    @Component
    @RequiredArgsConstructor
    public static class GetOrderItemByIdQueryHandler implements
            Command.Handler<GetOrderItemByIdQuery, GetOrderItemByIdResponse> {

        private final OrderItemRepository orderItemRepository;

        @Override
        public GetOrderItemByIdResponse handle(GetOrderItemByIdQuery getOrderItemByIdQuery) {
            return null;
        }
    }
}
