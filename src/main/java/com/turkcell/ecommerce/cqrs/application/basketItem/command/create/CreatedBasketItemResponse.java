package com.turkcell.ecommerce.cqrs.application.basketItem.command.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedBasketItemResponse {
    private UUID id;
    private UUID productId;
    private int quantity;
    private double totalPrice;
}
