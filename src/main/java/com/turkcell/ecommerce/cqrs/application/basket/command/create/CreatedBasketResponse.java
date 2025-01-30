package com.turkcell.ecommerce.cqrs.application.basket.command.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedBasketResponse {
    private UUID id;
    private UUID userId;
}
