package com.turkcell.ecommerce.cqrs.application.order.query.getlist;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

public class GetListOrderQuery implements Command<List<GetListOrderResponse>> {

    @Component
    @RequiredArgsConstructor
    public static class GetListOrderQueryHandler implements
            Command.Handler<GetListOrderQuery, List<GetListOrderResponse>> {

        private final OrderRepository orderRepository;

        @Override
        public List<GetListOrderResponse> handle(GetListOrderQuery getListOrderQuery) {
            return List.of();
        }
    }
}
