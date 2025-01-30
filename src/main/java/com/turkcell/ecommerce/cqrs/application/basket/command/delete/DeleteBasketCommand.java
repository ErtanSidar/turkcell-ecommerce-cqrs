package com.turkcell.ecommerce.cqrs.application.basket.command.delete;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.basket.BasketRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class DeleteBasketCommand implements Command<DeletedBasketResponse> {
    private UUID id;

    @Component
    @RequiredArgsConstructor
    public static class DeleteBasketCommandHandler implements
    Command.Handler<DeleteBasketCommand, DeletedBasketResponse> {

        private final BasketRepository basketRepository;

        @Override
        public DeletedBasketResponse handle(DeleteBasketCommand deleteBasketCommand) {
            return null;
        }
    }
}
