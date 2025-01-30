package com.turkcell.ecommerce.cqrs.application.basketItem.query.getbyid;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBasketItemByIdResponse {
    private UUID id;
    private UUID productId;
    private int quantity;
    private double totalPrice;
}
