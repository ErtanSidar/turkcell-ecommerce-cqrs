package com.turkcell.ecommerce.cqrs.application.basketItem.command.create;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.basketItem.BasketItemRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
public class CreateBasketItemCommand implements Command<CreatedBasketItemResponse> {
    private int basketId;
    private List<BasketItemList> basketItems;

    @Component
    @RequiredArgsConstructor
    public static class CreateBasketItemCommandHandler implements
    Command.Handler<CreateBasketItemCommand, CreatedBasketItemResponse>{

        private final BasketItemRepository basketItemRepository;

        @Override
        public CreatedBasketItemResponse handle(CreateBasketItemCommand createBasketItemCommand) {
            return null;
        }
    }
}

@Data
@AllArgsConstructor
@NoArgsConstructor
class BasketItemList {
    private int productId;
    private int quantity;
}
