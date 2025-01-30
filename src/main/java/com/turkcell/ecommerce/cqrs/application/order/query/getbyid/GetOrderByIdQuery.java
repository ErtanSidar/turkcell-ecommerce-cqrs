package com.turkcell.ecommerce.cqrs.application.order.query.getbyid;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

public class GetOrderByIdQuery implements Command<GetOrderByIdResponse> {

    @Component
    @RequiredArgsConstructor
    public static class GetOrderByIdQueryHandler implements
            Command.Handler<GetOrderByIdQuery, GetOrderByIdResponse> {

        private final OrderRepository orderRepository;

        @Override
        public GetOrderByIdResponse handle(GetOrderByIdQuery getOrderByIdQuery) {
            return null;
        }
    }
}
