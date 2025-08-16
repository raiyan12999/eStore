package com.webApp.eStore.controller;


import com.webApp.eStore.model.Category;
import com.webApp.eStore.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CategoryController {

    @Autowired
    public CategoryService service;

    @GetMapping("/categories")
    public List<Category> getCategory(){
        return service.getAllCategory();
    }
}
