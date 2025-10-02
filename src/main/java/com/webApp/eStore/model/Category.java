package com.webApp.eStore.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

    // New field
    @OneToMany(mappedBy = "category", cascade= CascadeType.ALL)
    @JsonManagedReference
    private List<Product> products = new ArrayList<>();

    // Empty constructor (needed for JPA)
    public Category(){

    }

    public Category(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
