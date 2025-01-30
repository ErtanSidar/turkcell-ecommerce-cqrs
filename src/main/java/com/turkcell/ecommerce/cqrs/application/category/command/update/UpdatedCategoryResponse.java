package com.turkcell.ecommerce.cqrs.application.category.command.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatedCategoryResponse {
    private UUID id;
    private String name;
}
