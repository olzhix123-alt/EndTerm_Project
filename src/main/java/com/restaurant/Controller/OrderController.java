package com.restaurant.Controller;

import com.restaurant.model.RestaurantOrder;
import com.restaurant.service.OrderService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<RestaurantOrder> getOrders() {
        return orderService.getAllOrders();
    }

    @PostMapping
    public RestaurantOrder addOrder(@RequestBody RestaurantOrder orderRequest) {
        return orderService.createOrder(orderRequest);
    }
}