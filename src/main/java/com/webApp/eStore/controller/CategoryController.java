package com.webApp.eStore.controller;


import com.webApp.eStore.model.Category;
import com.webApp.eStore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CategoryController {

    @Autowired
    public CategoryService service;

    @GetMapping("/test")
    public String testing(){
        return "Hello from categoryRepo Branch";
    }

    @GetMapping("/categories")
    public List<Category> getCategory(){
        return service.getAllCategory();
    }

    @PostMapping("/categories")
    public void addCategory(@RequestBody Category category) {
        service.addACategory(category);
    }

    @DeleteMapping("categories/{id}")
    public void deleteACategory(@PathVariable int id){
        service.deleteCategory(id);
    }

}
