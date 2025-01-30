package com.turkcell.ecommerce.cqrs.application.orderItem.command.delete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeletedOrderItemResponse {
    private UUID orderId;
    private UUID productId;
    private int quantity;
    private double totalPrice;
}
