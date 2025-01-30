package com.turkcell.ecommerce.cqrs.application.order.query.getbyid;

import com.turkcell.ecommerce.cqrs.domain.entity.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetOrderByIdResponse {
    private UUID id;
    private String orderNumber;
    private OrderStatus status;
    private LocalDateTime orderDate;
    private double totalAmount;
}
