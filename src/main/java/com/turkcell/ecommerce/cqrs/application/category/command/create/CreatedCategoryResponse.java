package com.turkcell.ecommerce.cqrs.application.category.command.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreatedCategoryResponse {
    private UUID id;
    private String name;
}
