package com.turkcell.ecommerce.cqrs.application.product.command.create;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.product.ProductRepository;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
public class CreateProductCommand implements Command<CreatedProductResponse> {
    @NotBlank(message = "Product name is required")
    @Size(max = 50)
    private String name;

    @Size(max = 500)
    private String description;

    @NotNull(message = "Price is required")
    @Min(value = 0, message = "Price must be greater than 0")
    private double price;

    @NotNull(message = "Stock quantity is required")
    @Min(value = 0, message = "Stock quantity cannot be negative")
    private int stock;

    @NotNull(message = "Category ID is required")
    private int categoryId;

    private String imageUrl;

    @Component
    @RequiredArgsConstructor
    public static class CreateProductCommandHandler implements
            Command.Handler<CreateProductCommand, CreatedProductResponse> {

        private final ProductRepository productRepository;

        @Override
        public CreatedProductResponse handle(CreateProductCommand createProductCommand) {
            return null;
        }
    }
}
