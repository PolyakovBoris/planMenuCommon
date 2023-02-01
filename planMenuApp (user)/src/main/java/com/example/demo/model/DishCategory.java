package com.example.demo.model;

public enum DishCategory {

    BREAKFAST("Завтрак"),
    SNACK("Перекус"),
    LAUNCH("Обед"),
    AFTERNOONSNACK("Полдник"),
    SUPPER("Ужин");

    private final String value;

    private DishCategory(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}