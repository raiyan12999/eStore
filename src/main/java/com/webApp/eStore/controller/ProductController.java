package com.webApp.eStore.controller;

import com.webApp.eStore.model.Product;
import com.webApp.eStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return service.getProducts();
    }
}
