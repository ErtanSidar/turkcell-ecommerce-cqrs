package com.turkcell.ecommerce.cqrs.core.pipelines.validation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ValidationError {
    private String field;
    private String error;
}
