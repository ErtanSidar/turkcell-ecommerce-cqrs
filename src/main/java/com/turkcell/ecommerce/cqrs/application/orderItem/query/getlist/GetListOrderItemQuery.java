package com.turkcell.ecommerce.cqrs.application.orderItem.query.getlist;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.orderItem.OrderItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

public class GetListOrderItemQuery implements Command<List<GetListOrderItemResponse>> {

    @Component
    @RequiredArgsConstructor
    public static class GetListOrderItemQueryHandler implements
            Command.Handler<GetListOrderItemQuery, List<GetListOrderItemResponse>> {

        private final OrderItemRepository orderItemRepository;

        @Override
        public List<GetListOrderItemResponse> handle(GetListOrderItemQuery getListOrderItemQuery) {
            return List.of();
        }
    }
}
