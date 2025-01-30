package com.turkcell.ecommerce.cqrs.application.category.command.delete;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.application.category.mappers.CategoryMapper;
import com.turkcell.ecommerce.cqrs.domain.entity.Category;
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

            CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

            Category category = categoryRepository.findById(deleteCategoryCommand.getId()).orElseThrow();
            categoryRepository.delete(category);

            return categoryMapper.converCategoryToDeletedCategoryResponse(category);
        }
    }
}
