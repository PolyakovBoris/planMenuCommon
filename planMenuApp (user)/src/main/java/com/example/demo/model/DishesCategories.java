package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "dishesCategories")
public class DishesCategories {

//    @SequenceGenerator(
//            name = "dishes_category_sequence",
//            sequenceName = "dishes_category_sequence",
//            allocationSize = 1
//    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
//            generator = "dishes_category_sequence"
    )
    private Long id;



    @Enumerated(EnumType.STRING)
    @Column(name = "name")
    private DishCategory name;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public DishCategory getDishCategory() {
//        return name;
//    }
    public DishCategory getName() {
        return name;
    }

    public void setDishCategory(DishCategory name) {
        this.name = name;
    }
}
