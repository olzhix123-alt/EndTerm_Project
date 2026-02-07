package com.restaurant.patterns;

import com.restaurant.model.*;

public class DishFactory {
    public static Dish createDish(String type) {
        if (type.equalsIgnoreCase("PIZZA")) {
            return new Pizza();
        } else if (type.equalsIgnoreCase("BURGER")) {
            return new Burger();
        }
        return null;
    }
}