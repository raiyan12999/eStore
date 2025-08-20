package com.webApp.eStore.service;

import com.webApp.eStore.model.ProductDetails;
import com.webApp.eStore.repository.ProductDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailsService {

    @Autowired
    public ProductDetailsRepo repo;

    public List<ProductDetails> getAllProductDetails(){
        return repo.findAll();
    }

    public void addDetails(ProductDetails details) {
        repo.save(details);
    }
}
