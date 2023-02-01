package com.example.demo.repository;

import com.example.demo.model.DishesCategories;
import org.springframework.data.repository.CrudRepository;

public interface DishCategoriesRepository extends CrudRepository<DishesCategories, Long> {
}
