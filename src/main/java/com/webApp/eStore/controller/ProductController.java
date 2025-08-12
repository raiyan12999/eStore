package com.webApp.eStore.controller;

import com.webApp.eStore.model.Product;
import com.webApp.eStore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping ("/products")
    public List<Product> getAllProducts(){
        return service.getProducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getAProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addAProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateAProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void deleteAProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
