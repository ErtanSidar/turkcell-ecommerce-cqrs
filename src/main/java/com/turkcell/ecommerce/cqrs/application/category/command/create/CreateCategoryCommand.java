package com.turkcell.ecommerce.cqrs.application.category.command.create;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.application.category.mappers.CategoryMapper;
import com.turkcell.ecommerce.cqrs.core.pipelines.auth.AuthenticatedRequest;
import com.turkcell.ecommerce.cqrs.core.pipelines.auth.AuthorizedRequest;
import com.turkcell.ecommerce.cqrs.domain.entity.Category;
import com.turkcell.ecommerce.cqrs.persistance.category.CategoryRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
public class CreateCategoryCommand implements Command<CreatedCategoryResponse>,AuthenticatedRequest, AuthorizedRequest {

    private String name;

    @Override
    public List<String> getRequiredRoles() {
        return List.of("Admin", "Category.Create");
    }


    @Component
    @RequiredArgsConstructor
    public static class CreateCategoryCommandHandler implements Command.Handler<CreateCategoryCommand, CreatedCategoryResponse> {

        private final CategoryRepository categoryRepository;

        @Override
        public CreatedCategoryResponse handle(CreateCategoryCommand createCategoryCommand) {

            CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

            Category category = categoryMapper.converCreateCategoryCommandToCategory(createCategoryCommand);

            categoryRepository.save(category);

            return categoryMapper.convertCategoryToCreatedCategoryResponse(category);
        }
    }
}
