package com.turkcell.ecommerce.cqrs.application.basketItem.command.delete;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.basketItem.BasketItemRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class DeleteBasketItemCommand implements Command<DeletedBasketItemResponse> {
    private UUID id;

    @Component
    @RequiredArgsConstructor
    public static class DeleteBasketItemCommandHandler implements
            Command.Handler<DeleteBasketItemCommand, DeletedBasketItemResponse> {

        private final BasketItemRepository basketItemRepository;

        @Override
        public DeletedBasketItemResponse handle(DeleteBasketItemCommand deleteBasketItemCommand) {
            return null;
        }
    }
}
