package com.urvashi.productserviceAPI.demo.Controller;

import com.urvashi.productserviceAPI.demo.Service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class CategoryController {
    private CategoryService categoryservice;
    public CategoryController(CategoryService categoryService){
        this.categoryservice=categoryService;
    }

    @GetMapping("/categories")
    public String getAllCategory(){
        return "getting all Categies";
    }
    @GetMapping("/categories/categoryId")
    public String getProductsInCategory(@PathVariable Long categoryId){
        return "get products in category";
    }
}
