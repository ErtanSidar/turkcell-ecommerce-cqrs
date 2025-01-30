package com.turkcell.ecommerce.cqrs.application.product.command.delete;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.product.ProductRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class DeleteProductCommand implements Command<DeletedProductResponse> {

    private UUID id;

    @Component
    @RequiredArgsConstructor
    public static class DeleteProductCommandHandler implements
    Command.Handler<DeleteProductCommand, DeletedProductResponse> {

        private final ProductRepository productRepository;

        @Override
        public DeletedProductResponse handle(DeleteProductCommand deleteProductCommand) {
            return null;
        }

    }
}
