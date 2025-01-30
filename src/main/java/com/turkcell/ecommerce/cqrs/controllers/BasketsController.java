package com.turkcell.ecommerce.cqrs.controllers;

import an.awesome.pipelinr.Pipeline;
import com.turkcell.ecommerce.cqrs.application.basket.command.create.CreateBasketCommand;
import com.turkcell.ecommerce.cqrs.application.basket.command.create.CreatedBasketResponse;
import com.turkcell.ecommerce.cqrs.application.basket.command.delete.DeleteBasketCommand;
import com.turkcell.ecommerce.cqrs.application.basket.command.delete.DeletedBasketResponse;
import com.turkcell.ecommerce.cqrs.application.basket.command.update.UpdateBasketCommand;
import com.turkcell.ecommerce.cqrs.application.basket.command.update.UpdatedBasketResponse;
import com.turkcell.ecommerce.cqrs.application.basket.query.getbyid.GetBasketByIdQuery;
import com.turkcell.ecommerce.cqrs.application.basket.query.getbyid.GetBasketByIdResponse;
import com.turkcell.ecommerce.cqrs.application.basket.query.getlist.GetListBasketQuery;
import com.turkcell.ecommerce.cqrs.application.basket.query.getlist.GetListBasketResponse;
import com.turkcell.ecommerce.cqrs.core.web.BaseController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/baskets")
public class BasketsController extends BaseController {

    public BasketsController(Pipeline pipeline) {
        super(pipeline);
    }

    @GetMapping
    public GetBasketByIdResponse getById(@RequestParam UUID id) {
        GetBasketByIdQuery getBasketByIdQuery = new GetBasketByIdQuery();
        getBasketByIdQuery.setId(id);
        return getBasketByIdQuery.execute(pipeline);
    }

    @GetMapping("/all")
    public List<GetListBasketResponse> getAll() {
        GetListBasketQuery getListBasketQuery = new GetListBasketQuery();
        return getListBasketQuery.execute(pipeline);
    }

    @PostMapping
    public CreatedBasketResponse create(@RequestBody CreateBasketCommand createBasketCommand) {
        return createBasketCommand.execute(pipeline);
    }

    @PutMapping
    public UpdatedBasketResponse update(@RequestBody UpdateBasketCommand updateBasketCommand) {
        return updateBasketCommand.execute(pipeline);
    }

    @DeleteMapping
    public DeletedBasketResponse delete(@RequestBody DeleteBasketCommand deleteBasketCommand) {
        return deleteBasketCommand.execute(pipeline);
    }

}
