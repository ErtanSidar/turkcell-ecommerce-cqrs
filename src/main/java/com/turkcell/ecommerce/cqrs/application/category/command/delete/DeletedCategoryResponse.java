package com.turkcell.ecommerce.cqrs.application.category.command.delete;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeletedCategoryResponse {
    private UUID id;
    private String name;
}
