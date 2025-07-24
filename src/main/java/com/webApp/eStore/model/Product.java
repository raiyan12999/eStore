package com.webApp.eStore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {

    @Id
    private int prodId;
    private String name;
    private int price;

    public Product(int prodId, String name, int price){
        this.prodId = prodId;
        this.name = name;
        this.price = price;
    }

    public Product() {

    }


    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
