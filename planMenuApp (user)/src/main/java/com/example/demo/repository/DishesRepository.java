package com.example.demo.repository;

import com.example.demo.model.Dishes;
import org.springframework.data.repository.CrudRepository;

public interface DishesRepository extends CrudRepository<Dishes,Long> {
}
