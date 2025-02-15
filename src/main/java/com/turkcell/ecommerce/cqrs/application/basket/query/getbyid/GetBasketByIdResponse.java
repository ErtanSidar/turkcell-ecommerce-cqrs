package com.turkcell.ecommerce.cqrs.application.basket.query.getbyid;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBasketByIdResponse {
    private UUID id;
}
