package com.turkcell.ecommerce.cqrs.application.basket.command.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatedBasketResponse {
    private UUID id;
}
