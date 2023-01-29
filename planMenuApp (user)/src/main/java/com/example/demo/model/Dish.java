package com.example.demo.model;

public enum Dish {
    RICE("Rice"),
    SALAD("Salad"),
    APPLE("Apple");

    private final String value;

    private Dish(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }

}