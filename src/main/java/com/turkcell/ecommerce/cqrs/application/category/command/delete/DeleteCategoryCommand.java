package com.turkcell.ecommerce.cqrs.application.category.command.delete;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.category.CategoryRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class DeleteCategoryCommand implements Command<DeletedCategoryResponse> {

    private UUID id;

    @Component
    @RequiredArgsConstructor
    public static class DeleteCategoryCommandHandler implements
            Command.Handler<DeleteCategoryCommand, DeletedCategoryResponse> {

        private final CategoryRepository categoryRepository;

        @Override
        public DeletedCategoryResponse handle(DeleteCategoryCommand deleteCategoryCommand) {
            return null;
        }
    }
}
