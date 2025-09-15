package com.webApp.eStore.service;

import com.webApp.eStore.model.Product;
import com.webApp.eStore.model.ProductDetails;
import com.webApp.eStore.repository.ProductDetailsRepo;
import com.webApp.eStore.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    @Autowired
    ProductDetailsRepo detailsRepo;



    public List<Product> getProducts(){
        return repo.findAll();
    }

    public void addProduct (Product prod){
        ProductDetails details = prod.getDetails();
        if (details != null){
            prod.setDetails(details);
            details.setProduct(prod);
            detailsRepo.save(details);
        } else {
            repo.save(prod);
        }
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }

    public void updateProduct(Product prod){
        repo.save(prod);
    }

    public void deleteProduct(int prodId){
        repo.deleteById(prodId);
    }

    public void createProductWithDetails(Product prod, ProductDetails details){
        prod.setDetails(details);
        System.out.println("Details inside product: " + prod.getDetails().getWeight());
        System.out.println("Details info: " + details.getWeight() + details.getColor());
        System.out.println("Product info: " + prod.getName());
        details.setProduct(prod);
        detailsRepo.save(details);
//        repo.save(prod);

        // Questions here
    }
}
