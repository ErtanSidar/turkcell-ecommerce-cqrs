package com.turkcell.ecommerce.cqrs.application.product.command.update;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.application.product.mappers.ProductMapper;
import com.turkcell.ecommerce.cqrs.domain.entity.Product;
import com.turkcell.ecommerce.cqrs.persistance.product.ProductRepository;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class UpdateProductCommand implements Command<UpdatedProductResponse> {

    private UUID id;

    @Size(max = 50)
    private String name;

    @Min(value = 0, message = "Price must be greater than 0")
    private double price;

    @Min(value = 0, message = "Stock quantity cannot be negative")
    private int stock;

    @Component
    @RequiredArgsConstructor
    public static class UpdateProductCommandHandler implements
            Command.Handler<UpdateProductCommand, UpdatedProductResponse> {

        private final ProductRepository productRepository;

        @Override
        public UpdatedProductResponse handle(UpdateProductCommand updateProductCommand) {
            ProductMapper productMapper = ProductMapper.INSTANCE;
            Product product = productRepository.findById(updateProductCommand.getId()).orElse(null);
            product.setName(updateProductCommand.getName());
            product.setPrice(updateProductCommand.getPrice());
            product.setStock(updateProductCommand.getStock());
            productRepository.save(product);
            return productMapper.convertProductToUpdatedProductResponse(product);
        }
    }
}
