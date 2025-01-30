package com.turkcell.ecommerce.cqrs.application.basketItem.query.getbyid;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.basketItem.BasketItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

public class GetBasketItemByIdQuery implements Command<GetBasketItemByIdResponse> {

    @Component
    @RequiredArgsConstructor
    public static class GetBasketItemByIdQueryHandler implements
            Command.Handler<GetBasketItemByIdQuery, GetBasketItemByIdResponse> {

        private final BasketItemRepository basketItemRepository;

        @Override
        public GetBasketItemByIdResponse handle(GetBasketItemByIdQuery getBasketItemByIdQuery) {
            return null;
        }
    }
}
