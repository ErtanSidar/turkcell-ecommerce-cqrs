package com.turkcell.ecommerce.cqrs.application.basketItem.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public class BasketItemMapper {
    BasketItemMapper INSTANCE = Mappers.getMapper(BasketItemMapper.class);
}
