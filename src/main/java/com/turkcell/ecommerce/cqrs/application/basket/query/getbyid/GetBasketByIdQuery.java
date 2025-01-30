package com.turkcell.ecommerce.cqrs.application.basket.query.getbyid;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.basket.BasketRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class GetBasketByIdQuery implements Command<GetBasketByIdResponse> {

    private UUID id;

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
