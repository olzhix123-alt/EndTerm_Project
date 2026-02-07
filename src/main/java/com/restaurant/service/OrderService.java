package com.restaurant.service;

import com.restaurant.model.RestaurantOrder;
import com.restaurant.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public RestaurantOrder createOrder(RestaurantOrder order) {
        return orderRepository.save(order);
    }

    public List<RestaurantOrder> getAllOrders() {
        return orderRepository.findAll();
    }
}