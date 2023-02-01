/*package com.example.demo.controller;

import com.example.demo.model.DishesCategories;
import com.example.demo.repository.DishCategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class DishCategoryController {
    @Autowired
    private DishCategoriesRepository dishCategoriesRepository;


    @PostMapping(value = {"/dishes_table"})
    public String dishCategoriesList(@ModelAttribute DishesCategories dishesCategories, Model model) {
        model.addAttribute("dishesCategories", dishesCategories);
        dishCategoriesRepository.save(dishesCategories);
        return "/homepage";
    }

}*/
