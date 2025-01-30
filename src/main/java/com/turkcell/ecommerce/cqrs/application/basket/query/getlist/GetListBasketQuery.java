package com.turkcell.ecommerce.cqrs.application.basket.query.getlist;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.basket.BasketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

public class GetListBasketQuery implements Command<List<GetListBasketResponse>> {

    @Component
    @RequiredArgsConstructor
    public static class GetListBasketQueryHandler implements
            Command.Handler<GetListBasketQuery, List<GetListBasketResponse>> {

        private final BasketRepository basketRepository;

        @Override
        public List<GetListBasketResponse> handle(GetListBasketQuery getListBasketQuery) {
            return List.of();
        }
    }
}
