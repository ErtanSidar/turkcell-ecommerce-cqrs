package com.turkcell.ecommerce.cqrs.application.category.query.getbyid;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetCategoryByIdResponse {
    private UUID id;
    private String name;
}
