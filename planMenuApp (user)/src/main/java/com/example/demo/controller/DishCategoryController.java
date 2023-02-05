//package com.example.demo.controller;
//
//import com.example.demo.model.DishesCategories;
//import com.example.demo.repository.DishCategoriesRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//
//
//@Controller
//public class DishCategoryController {
////    public DishCategoryController(DishCategoriesRepository dishCategoriesRepository) {
////        this.dishCategoriesRepository = dishCategoriesRepository;
////    }
//
//    @Autowired
//    private DishCategoriesRepository dishCategoriesRepository;
//
///*    @GetMapping(value = {"/dishes_table"})
//    public String dishCategoriesList(Model model){
//        model.addAttribute("dishesCategories", new DishesCategories());
//
//        return "dishes/dishes_table";
//    }
// **/
//    @PostMapping(value = {"/dishes_table"})
//    public String dishCategoriesList(@ModelAttribute DishesCategories dishesCategories, Model model){
//        model.addAttribute("dishesCategory", dishesCategories);
//        dishCategoriesRepository.save(dishesCategories);
////        model.addAttribute("dishesCategories", dishesCategories);
////        dishCategoriesRepository.save(dishesCategories);
//        return "/homepage";
//    }
//}
