package com.webApp.eStore.controller;

import com.webApp.eStore.model.ProductDetails;
import com.webApp.eStore.service.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/product-details")
    public void addProductDetails(@RequestBody ProductDetails details){
        service.addDetails(details);
    }
}
