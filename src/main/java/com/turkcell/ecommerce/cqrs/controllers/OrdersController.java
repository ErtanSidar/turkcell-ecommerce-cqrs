package com.turkcell.ecommerce.cqrs.controllers;

import an.awesome.pipelinr.Pipeline;
import com.turkcell.ecommerce.cqrs.application.order.command.create.CreateOrderCommand;
import com.turkcell.ecommerce.cqrs.application.order.command.create.CreatedOrderResponse;
import com.turkcell.ecommerce.cqrs.application.order.command.delete.DeleteOrderCommand;
import com.turkcell.ecommerce.cqrs.application.order.command.delete.DeletedOrderResponse;
import com.turkcell.ecommerce.cqrs.application.order.command.update.UpdateOrderCommand;
import com.turkcell.ecommerce.cqrs.application.order.command.update.UpdatedOrderResponse;
import com.turkcell.ecommerce.cqrs.application.order.query.getbyid.GetOrderByIdQuery;
import com.turkcell.ecommerce.cqrs.application.order.query.getbyid.GetOrderByIdResponse;
import com.turkcell.ecommerce.cqrs.application.order.query.getlist.GetListOrderQuery;
import com.turkcell.ecommerce.cqrs.application.order.query.getlist.GetListOrderResponse;
import com.turkcell.ecommerce.cqrs.core.web.BaseController;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersController extends BaseController {

    public OrdersController(Pipeline pipeline) {
        super(pipeline);
    }

    @GetMapping
    public GetOrderByIdResponse getById(@RequestParam UUID id) {
        GetOrderByIdQuery getOrderByIdQuery = new GetOrderByIdQuery();
        getOrderByIdQuery.setId(id);
        return getOrderByIdQuery.execute(pipeline);
    }

    @GetMapping("/all")
    public List<GetListOrderResponse> getAll() {
        GetListOrderQuery getListOrderQuery = new GetListOrderQuery();
        return getListOrderQuery.execute(pipeline);
    }

    @PostMapping
    public CreatedOrderResponse create(@RequestBody CreateOrderCommand createOrderCommand) {
        return createOrderCommand.execute(pipeline);
    }

    @PutMapping
    public UpdatedOrderResponse update(@RequestBody UpdateOrderCommand updateOrderCommand) {
        return updateOrderCommand.execute(pipeline);
    }

    @DeleteMapping
    public DeletedOrderResponse delete(@RequestBody DeleteOrderCommand deleteOrderCommand) {
        return deleteOrderCommand.execute(pipeline);
    }
}
