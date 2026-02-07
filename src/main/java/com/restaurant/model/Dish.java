package com.restaurant.model;

import lombok.Data;

@Data
public abstract class Dish {
    private String name;
    private double price;

    public abstract String getDescription();
}