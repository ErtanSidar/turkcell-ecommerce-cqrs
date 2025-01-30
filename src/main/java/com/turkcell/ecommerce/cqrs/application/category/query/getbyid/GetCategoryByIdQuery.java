package com.turkcell.ecommerce.cqrs.application.category.query.getbyid;


import an.awesome.pipelinr.Command;
import com.turkcell.ecommerce.cqrs.persistance.category.CategoryRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
public class GetCategoryByIdQuery implements Command<GetCategoryByIdResponse> {

    private UUID id;

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
