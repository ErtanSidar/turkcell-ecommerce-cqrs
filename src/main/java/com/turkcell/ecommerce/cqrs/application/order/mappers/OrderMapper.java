package com.turkcell.ecommerce.cqrs.application.order.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public class OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
}
