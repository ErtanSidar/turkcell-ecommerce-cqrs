package com.turkcell.ecommerce.cqrs.application.basket.command.update;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.basket.BasketRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class UpdateBasketCommand implements Command<UpdatedBasketResponse> {
    private UUID id;

    @Component
    @RequiredArgsConstructor
    public static class UpdateBasketCommandHandler implements
            Command.Handler<UpdateBasketCommand, UpdatedBasketResponse> {

        private final BasketRepository basketRepository;

        @Override
        public UpdatedBasketResponse handle(UpdateBasketCommand updateBasketCommand) {
            return null;
        }
    }
}
