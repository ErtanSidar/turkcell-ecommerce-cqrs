package com.turkcell.ecommerce.cqrs.application.product.query.getlist;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.application.product.mappers.ProductMapper;
import com.turkcell.ecommerce.cqrs.domain.entity.Product;
import com.turkcell.ecommerce.cqrs.persistance.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

public class GetListProductQuery implements Command<List<GetListProductResponse>> {

    @Component
    @RequiredArgsConstructor
    public static class GetListProductQueryHandler implements
            Command.Handler<GetListProductQuery, List<GetListProductResponse>> {

        private final ProductRepository productRepository;

        @Override
        public List<GetListProductResponse> handle(GetListProductQuery getListProductQuery) {
            ProductMapper productMapper = ProductMapper.INSTANCE;
            List<Product> products = productRepository.findAll();
            return productMapper.convertProductsToGetListProductResponse(products);
        }
    }
}
