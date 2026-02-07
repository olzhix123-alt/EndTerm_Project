package com.restaurant.model;

public class Burger extends Dish {
    public Burger() {
        this.setName("Classic Burger");
        this.setPrice(1800);
    }

    @Override
    public String getDescription() {
        return "Шырынды еті бар бургер";
    }
}