package com.webApp.eStore.service;

import com.webApp.eStore.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    Product product1 = new Product(101, "Laptop", 3000);
    Product product2 = new Product(102, "Desktop", 5000);
    Product product3 = new Product(103, "Phone", 4000);

    List<Product> products = new ArrayList<>(Arrays.asList(product1, product2, product3));

//    List<Product> products = Arrays.asList(new Product(101, "Laptop", 3000),
//                                            new Product(102, "Desktop", 5000),
//                                            new Product(103, "Phone", 2000));

    public List<Product> getProducts(){
        return products;
    }

    public void addProduct (Product prod){
        products.add(prod);
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }
}
