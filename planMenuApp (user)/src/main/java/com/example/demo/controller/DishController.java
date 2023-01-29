package com.example.demo.controller;

import com.example.demo.model.Dishes;
import com.example.demo.repository.DishesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DishController {
    @Autowired
    private DishesRepository dishesRepository;
    @GetMapping(value = {"/dishes_table"})
    public String dishList(Model model){
        model.addAttribute("dishes", new Dishes());
        return "dishes/dishes_table";
    }
    @PostMapping(value = {"/dishes_table"})
    public String dishList(@ModelAttribute Dishes dishes, Model model){
        model.addAttribute("dishes", dishes);
        dishesRepository.save(dishes);
        return "/homepage";
    }

}