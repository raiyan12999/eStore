package com.webApp.eStore.controller;

import com.webApp.eStore.model.ProductDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductDetailsController {

    @Autowired
    public ProductDetailsService service;

    @GetMapping("/product-details")
    public List<ProductDetails> getAllDetails(){
        return service.getAllProductDetails();
    }
}
