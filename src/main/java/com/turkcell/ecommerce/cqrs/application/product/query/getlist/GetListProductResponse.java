package com.turkcell.ecommerce.cqrs.application.product.query.getlist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListProductResponse {
    private UUID id;

    private String name;

    private String description;

    private double price;

    private int stock;

    private UUID categoryId;

    private String imageUrl;
}
