package com.turkcell.ecommerce.cqrs.application.product.query.getbyid;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.product.ProductRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class GetProductByIdQuery implements Command<GetProductByIdResponse> {

    private UUID id;

    @Component
    @RequiredArgsConstructor
    public static class GetProductByIdQueryHandler implements
            Command.Handler<GetProductByIdQuery, GetProductByIdResponse> {

        private final ProductRepository productRepository;

        @Override
        public GetProductByIdResponse handle(GetProductByIdQuery getProductByIdQuery) {
            return null;
        }
    }
}
