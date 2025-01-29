package com.turkcell.ecommerce.cqrs.application.product.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public class ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
}
