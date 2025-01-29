package com.turkcell.ecommerce.cqrs.controllers;

import an.awesome.pipelinr.Pipeline;
import com.turkcell.ecommerce.cqrs.core.web.BaseController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductsController extends BaseController {

    public ProductsController(Pipeline pipeline) {
        super(pipeline);
    }
}
