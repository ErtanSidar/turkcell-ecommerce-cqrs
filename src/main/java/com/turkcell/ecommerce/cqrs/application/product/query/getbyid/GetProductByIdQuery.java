package com.turkcell.ecommerce.cqrs.application.product.query.getbyid;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

public class GetProductByIdQuery implements Command<List<GetProductByIdResponse>> {

    @Component
    @RequiredArgsConstructor
    public static class GetProductByIdQueryHandler implements
            Command.Handler<GetProductByIdQuery, List<GetProductByIdResponse>> {

        private final ProductRepository productRepository;

        @Override
        public List<GetProductByIdResponse> handle(GetProductByIdQuery getProductByIdQuery) {
            return List.of();
        }
    }
}
