package com.turkcell.ecommerce.cqrs.application.basketItem.query.getlist;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.basketItem.BasketItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

public class GetListBasketItemQuery implements Command<List<GetListBasketItemResponse>> {

    @Component
    @RequiredArgsConstructor
    public static class GetListBasketItemQueryHandler implements
            Command.Handler<GetListBasketItemQuery, List<GetListBasketItemResponse>> {

        private final BasketItemRepository basketItemRepository;

        @Override
        public List<GetListBasketItemResponse> handle(GetListBasketItemQuery getListBasketItemQuery) {
            return List.of();
        }
    }
}
