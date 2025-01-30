package com.turkcell.ecommerce.cqrs.application.category.query.getlist;

import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.category.CategoryRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

public class GetListCategoryQuery implements Command<List<GetListCategoryResponse>> {

    @Data
    @RequiredArgsConstructor
    public static class GetListCategoryQueryHandler implements
        Command.Handler<GetListCategoryQuery, List<GetListCategoryResponse>> {

        private final CategoryRepository categoryRepository;

        @Override
        public List<GetListCategoryResponse> handle(GetListCategoryQuery getListCategoryQuery) {
            return List.of();
        }
    }
}
