package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "dishes")
public class Dishes {

    @SequenceGenerator(
            name = "dishes_table_sequence",
            sequenceName = "dishes_table_sequence",
            allocationSize = 1
    )

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "dishes_table_sequence"
    )

    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "dishName")
    private Dish dishName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Dish getDishName() {
        return dishName;
    }

    public void setDishName(Dish dishName) {
        this.dishName = dishName;
    }

}
