package com.webApp.eStore.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
public class ProductDetails {
    @Id
    private int id;

    private String weight;
    private String color;

    // Relationship field - this is the owning side
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id")
    private Product product;

    public ProductDetails(){

    }

    public ProductDetails(String weight, String color){
        this.weight = weight;
        this.color = color;
    }

    // Getters/Setters (for all the fields, including product)
    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getWeight(){
        return weight;
    }

    public void setWeight(String weight){
        this.weight = weight;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public Product getProduct(){
        return product;
    }

    public void setProduct(Product product){
        this.product = product;
    }
}
