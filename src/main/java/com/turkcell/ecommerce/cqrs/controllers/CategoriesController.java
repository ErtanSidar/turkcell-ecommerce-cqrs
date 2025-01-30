package com.turkcell.ecommerce.cqrs.controllers;

import an.awesome.pipelinr.Pipeline;
import com.turkcell.ecommerce.cqrs.application.category.command.create.CreateCategoryCommand;
import com.turkcell.ecommerce.cqrs.application.category.command.create.CreatedCategoryResponse;
import com.turkcell.ecommerce.cqrs.application.category.command.delete.DeleteCategoryCommand;
import com.turkcell.ecommerce.cqrs.application.category.command.delete.DeletedCategoryResponse;
import com.turkcell.ecommerce.cqrs.application.category.command.update.UpdateCategoryCommand;
import com.turkcell.ecommerce.cqrs.application.category.command.update.UpdatedCategoryResponse;
import com.turkcell.ecommerce.cqrs.application.category.query.getbyid.GetCategoryByIdQuery;
import com.turkcell.ecommerce.cqrs.application.category.query.getbyid.GetCategoryByIdResponse;
import com.turkcell.ecommerce.cqrs.application.category.query.getlist.GetListCategoryQuery;
import com.turkcell.ecommerce.cqrs.application.category.query.getlist.GetListCategoryResponse;
import com.turkcell.ecommerce.cqrs.core.web.BaseController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoriesController extends BaseController {

    public CategoriesController(Pipeline pipeline) {
        super(pipeline);
    }


    @GetMapping
    public GetCategoryByIdResponse getById(@RequestParam UUID id) {
        GetCategoryByIdQuery getCategoryByIdQuery = new GetCategoryByIdQuery();
        getCategoryByIdQuery.setId(id);
        return getCategoryByIdQuery.execute(pipeline);
    }

    @GetMapping("/all")
    public List<GetListCategoryResponse> getAll() {
        GetListCategoryQuery getListCategoryQuery = new GetListCategoryQuery();
        return getListCategoryQuery.execute(pipeline);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedCategoryResponse create(@RequestBody CreateCategoryCommand createCategoryCommand) {
        return createCategoryCommand.execute(pipeline);
    }

    @PutMapping
    public UpdatedCategoryResponse update(@RequestBody UpdateCategoryCommand updateCategoryCommand) {
        return updateCategoryCommand.execute(pipeline);
    }

    @DeleteMapping
    public DeletedCategoryResponse delete(@RequestBody DeleteCategoryCommand deleteCategoryCommand) {
        return deleteCategoryCommand.execute(pipeline);
    }


}
