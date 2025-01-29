package com.turkcell.ecommerce.cqrs.controllers;

import an.awesome.pipelinr.Pipeline;
import com.turkcell.ecommerce.cqrs.application.category.command.create.CreateCategoryCommand;
import com.turkcell.ecommerce.cqrs.application.category.command.create.CreatedCategoryResponse;
import com.turkcell.ecommerce.cqrs.core.web.BaseController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoriesController extends BaseController {

    public CategoriesController(Pipeline pipeline) {
        super(pipeline);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedCategoryResponse createCategory(@RequestBody CreateCategoryCommand createCategoryCommand) {
        return createCategoryCommand.execute(pipeline);
    }
}
