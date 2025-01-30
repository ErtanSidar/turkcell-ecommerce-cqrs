package com.turkcell.ecommerce.cqrs.application.category.mappers;

import com.turkcell.ecommerce.cqrs.application.category.command.create.CreateCategoryCommand;
import com.turkcell.ecommerce.cqrs.application.category.command.create.CreatedCategoryResponse;
import com.turkcell.ecommerce.cqrs.application.category.command.delete.DeletedCategoryResponse;
import com.turkcell.ecommerce.cqrs.application.category.command.update.UpdateCategoryCommand;
import com.turkcell.ecommerce.cqrs.application.category.command.update.UpdatedCategoryResponse;
import com.turkcell.ecommerce.cqrs.application.category.query.getbyid.GetCategoryByIdResponse;
import com.turkcell.ecommerce.cqrs.application.category.query.getlist.GetListCategoryResponse;
import com.turkcell.ecommerce.cqrs.domain.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    Category converCreateCategoryCommandToCategory(CreateCategoryCommand createCategoryCommand);

    CreatedCategoryResponse convertCategoryToCreatedCategoryResponse(Category category);

    Category converUpdateCategoryCommandToCategory(UpdateCategoryCommand updateCategoryCommand);

    UpdatedCategoryResponse convertCategoryToUpdatedCategoryResponse(Category category);

    DeletedCategoryResponse converCategoryToDeletedCategoryResponse(Category category);

    GetCategoryByIdResponse convertCategoryToGetCategoryByIdResponse(Category category);

    List<GetListCategoryResponse> convertCategoriesToGetListCategoryResponse(List<Category> categories);
}
