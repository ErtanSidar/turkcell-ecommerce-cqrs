package com.turkcell.ecommerce.cqrs.application.category.command.create;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.domain.entity.Category;
import com.turkcell.ecommerce.cqrs.persistance.category.CategoryRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Data
public class CreateCategoryCommand implements Command<CreatedCategoryResponse> {

    private String name;


    @Component
    @RequiredArgsConstructor
    public static class CreateCategoryCommandHandler implements Command.Handler<CreateCategoryCommand, CreatedCategoryResponse> {

        private final CategoryRepository categoryRepository;

        @Override
        public CreatedCategoryResponse handle(CreateCategoryCommand createCategoryCommand) {

            Category category = new Category();
            category.setName(createCategoryCommand.getName());
            categoryRepository.save(category);

            return new CreatedCategoryResponse(category.getId(), category.getName());
        }
    }
}
