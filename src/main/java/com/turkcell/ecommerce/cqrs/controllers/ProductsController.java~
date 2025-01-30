package com.turkcell.ecommerce.cqrs.controllers;

import an.awesome.pipelinr.Pipeline;
import com.turkcell.ecommerce.cqrs.application.product.command.create.CreateProductCommand;
import com.turkcell.ecommerce.cqrs.application.product.command.create.CreatedProductResponse;
import com.turkcell.ecommerce.cqrs.application.product.command.delete.DeleteProductCommand;
import com.turkcell.ecommerce.cqrs.application.product.command.delete.DeletedProductResponse;
import com.turkcell.ecommerce.cqrs.application.product.query.getbyid.GetProductByIdQuery;
import com.turkcell.ecommerce.cqrs.application.product.query.getbyid.GetProductByIdResponse;
import com.turkcell.ecommerce.cqrs.application.product.query.getlist.GetListProductQuery;
import com.turkcell.ecommerce.cqrs.application.product.query.getlist.GetListProductResponse;
import com.turkcell.ecommerce.cqrs.core.web.BaseController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController extends BaseController {

    public ProductsController(Pipeline pipeline) {
        super(pipeline);
    }

    @GetMapping
    public GetProductByIdResponse getById(@RequestParam UUID id) {
        GetProductByIdQuery getProductByIdQuery = new GetProductByIdQuery();
        getProductByIdQuery.setId(id);
        return getProductByIdQuery.execute(pipeline);
    }

    @GetMapping("/all")
    public List<GetListProductResponse> getAll() {
        GetListProductQuery getListProductQuery = new GetListProductQuery();
        return getListProductQuery.execute(pipeline);
    }

    @PostMapping
    public CreatedProductResponse create(@RequestBody CreateProductCommand createProductCommand) {
        return createProductCommand.execute(pipeline);
    }

    @PutMapping
    public CreatedProductResponse update(@RequestBody CreateProductCommand createProductCommand) {
        return createProductCommand.execute(pipeline);
    }

    @DeleteMapping
    public DeletedProductResponse delete(@RequestBody DeleteProductCommand deleteProductCommand) {
        return deleteProductCommand.execute(pipeline);
    }
}
