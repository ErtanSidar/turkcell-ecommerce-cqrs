package com.turkcell.ecommerce.cqrs.application.category.query.getbyid;


import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.category.CategoryRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;

public class GetCategoryByIdQuery implements Command<GetCategoryByIdResponse> {

    @Data
    @RequiredArgsConstructor
    public static class GetCategoryByIdQueryHandler implements
            Command.Handler<GetCategoryByIdQuery, GetCategoryByIdResponse> {

        private final CategoryRepository categoryRepository;

        @Override
        public GetCategoryByIdResponse handle(GetCategoryByIdQuery getCategoryByIdQuery) {
            return null;
        }
    }
}
