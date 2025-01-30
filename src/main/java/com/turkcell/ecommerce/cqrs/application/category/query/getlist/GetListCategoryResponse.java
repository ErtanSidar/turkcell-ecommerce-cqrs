package com.turkcell.ecommerce.cqrs.application.category.query.getlist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetListCategoryResponse {
    private UUID id;
    private String name;
}
