package com.turkcell.ecommerce.cqrs.application.basket.query.getbyid;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.basket.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

public class GetBasketByIdQuery implements Command<GetBasketByIdResponse> {

    @Component
    @RequiredArgsConstructor
    public static class GetBasketByIdQueryHandler implements
            Command.Handler<GetBasketByIdQuery, GetBasketByIdResponse> {

        private final BasketRepository basketRepository;

        @Override
        public GetBasketByIdResponse handle(GetBasketByIdQuery getBasketByIdQuery) {
            return null;
        }
    }
}
