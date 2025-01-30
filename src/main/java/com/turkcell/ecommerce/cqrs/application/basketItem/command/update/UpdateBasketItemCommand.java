package com.turkcell.ecommerce.cqrs.application.basketItem.command.update;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.basketItem.BasketItemRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class UpdateBasketItemCommand implements Command<UpdatedBasketItemResponse> {
    private UUID id;
    private int quantity;

    @Component
    @RequiredArgsConstructor
    public static class UpdateBasketItemCommandHandler implements
    Command.Handler<UpdateBasketItemCommand, UpdatedBasketItemResponse> {

        private final BasketItemRepository basketItemRepository;

        @Override
        public UpdatedBasketItemResponse handle(UpdateBasketItemCommand updateBasketItemCommand) {
            return null;
        }
    }
}
