package com.turkcell.ecommerce.cqrs.application.basket.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public class BasketMapper {
    BasketMapper INSTANCE = Mappers.getMapper(BasketMapper.class);


}
