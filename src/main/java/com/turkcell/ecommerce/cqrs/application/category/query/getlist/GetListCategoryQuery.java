package com.turkcell.ecommerce.cqrs.application.category.query.getlist;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.application.category.mappers.CategoryMapper;
import com.turkcell.ecommerce.cqrs.domain.entity.Category;
import com.turkcell.ecommerce.cqrs.persistance.category.CategoryRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

public class GetListCategoryQuery implements Command<List<GetListCategoryResponse>> {

    @Component
    @RequiredArgsConstructor
    public static class GetListCategoryQueryHandler implements
        Command.Handler<GetListCategoryQuery, List<GetListCategoryResponse>> {

        private final CategoryRepository categoryRepository;

        @Override
        public List<GetListCategoryResponse> handle(GetListCategoryQuery getListCategoryQuery) {
            CategoryMapper categoryMapper = CategoryMapper.INSTANCE;
            List<Category> categories = categoryRepository.findAll();
            return categoryMapper.convertCategoriesToGetListCategoryResponse(categories);
        }
    }
}
