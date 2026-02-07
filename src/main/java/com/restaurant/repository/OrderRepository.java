package com.restaurant.repository;

import com.restaurant.model.RestaurantOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<RestaurantOrder, Long> {
}