package com.restaurant.patterns;

public class AppConfig {
    private static AppConfig instance;
    private String restaurantName = "Best Taste Restaurant";

    private AppConfig() {} // Конструктор жабық

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    public String getRestaurantName() { return restaurantName; }
}