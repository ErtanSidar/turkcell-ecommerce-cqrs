package com.turkcell.ecommerce.cqrs.application.category.query.getbyid;


import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.application.category.mappers.CategoryMapper;
import com.turkcell.ecommerce.cqrs.domain.entity.Category;
import com.turkcell.ecommerce.cqrs.persistance.category.CategoryRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class GetCategoryByIdQuery implements Command<GetCategoryByIdResponse> {

    private UUID id;

    @Component
    @RequiredArgsConstructor
    public static class GetCategoryByIdQueryHandler implements
            Command.Handler<GetCategoryByIdQuery, GetCategoryByIdResponse> {

        private final CategoryRepository categoryRepository;

        @Override
        public GetCategoryByIdResponse handle(GetCategoryByIdQuery getCategoryByIdQuery) {
            CategoryMapper categoryMapper = CategoryMapper.INSTANCE;
            Category category = categoryRepository.findById(getCategoryByIdQuery.getId()).orElse(null);
            return categoryMapper.convertCategoryToGetCategoryByIdResponse(category);
        }
    }
}
