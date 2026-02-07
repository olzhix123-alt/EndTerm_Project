package com.restaurant.model;

public class Pizza extends Dish {
    public Pizza() {
        this.setName("Margarita");
        this.setPrice(2500);
    }
    @Override
    public String getDescription() { return "Классикалық пицца"; }
}