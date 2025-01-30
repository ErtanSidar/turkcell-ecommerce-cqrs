package com.turkcell.ecommerce.cqrs.application.orderItem.query.getlist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListOrderItemResponse {
    private UUID orderId;
    private UUID productId;
    private int quantity;
    private double totalPrice;
}
