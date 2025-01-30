package com.turkcell.ecommerce.cqrs.application.basket.command.create;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.basket.BasketRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
public class CreateBasketCommand implements Command<CreatedBasketResponse> {
    private int userId;
    private List<BasketItemList> basketItems;


    @Component
    @RequiredArgsConstructor
    public static class CreateBasketCommandHandler implements
    Command.Handler<CreateBasketCommand, CreatedBasketResponse> {

        private final BasketRepository basketRepository;

        @Override
        public CreatedBasketResponse handle(CreateBasketCommand createBasketCommand) {
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
