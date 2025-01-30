package com.turkcell.ecommerce.cqrs.application.category.command.update;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.category.CategoryRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class UpdateCategoryCommand implements Command<UpdatedCategoryResponse> {
    private UUID id;
    private String name;

    @Component
    @RequiredArgsConstructor
    public static class UpdateCategoryCommandHandler implements
    Command.Handler<UpdateCategoryCommand, UpdatedCategoryResponse> {

        private final CategoryRepository categoryRepository;

        @Override
        public UpdatedCategoryResponse handle(UpdateCategoryCommand updateCategoryCommand) {
            return null;
        }
    }
}
