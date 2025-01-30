package com.turkcell.ecommerce.cqrs.application.basket.command.delete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeletedBasketResponse {
    private UUID id;
}
