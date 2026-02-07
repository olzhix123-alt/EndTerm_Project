package com.restaurant.Controller;

import com.restaurant.model.Dish;
import com.restaurant.patterns.DishFactory;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @GetMapping
    public List<Dish> getMenu() {
        List<Dish> menu = new ArrayList<>();
        menu.add(DishFactory.createDish("PIZZA"));
        menu.add(DishFactory.createDish("BURGER"));
        return menu;
    }
}