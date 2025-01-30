package com.turkcell.ecommerce.cqrs.application.product.mappers;

import com.turkcell.ecommerce.cqrs.application.product.command.create.CreateProductCommand;
import com.turkcell.ecommerce.cqrs.application.product.command.create.CreatedProductResponse;
import com.turkcell.ecommerce.cqrs.application.product.command.delete.DeletedProductResponse;
import com.turkcell.ecommerce.cqrs.application.product.command.update.UpdateProductCommand;
import com.turkcell.ecommerce.cqrs.application.product.command.update.UpdatedProductResponse;
import com.turkcell.ecommerce.cqrs.application.product.query.getbyid.GetProductByIdResponse;
import com.turkcell.ecommerce.cqrs.application.product.query.getlist.GetListProductResponse;
import com.turkcell.ecommerce.cqrs.domain.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "category.id", source = "categoryId")
    Product convertCreateProductCommandToProduct(CreateProductCommand createProductCommand);

    @Mapping(target = "categoryId", source = "category.id")
    CreatedProductResponse convertProductToCreatedProductResponse(Product product);

    Product convertUpdateProductCommandToProduct(UpdateProductCommand updateProductCommand);

    UpdatedProductResponse convertProductToUpdatedProductResponse(Product product);

    DeletedProductResponse convertProductToDeletedProductResponse(Product product);

    GetProductByIdResponse convertProductTogetProductByIdResponse(Product product);

    List<GetListProductResponse> convertProductsToGetListProductResponse(List<Product> products);
}
