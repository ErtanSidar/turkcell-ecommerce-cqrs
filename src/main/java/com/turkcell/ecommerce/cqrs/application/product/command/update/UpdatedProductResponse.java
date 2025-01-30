package com.turkcell.ecommerce.cqrs.application.product.command.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatedProductResponse {
    private UUID id;

    private String name;

    private String description;

    private double price;

    private int stock;

    private int categoryId;
}
