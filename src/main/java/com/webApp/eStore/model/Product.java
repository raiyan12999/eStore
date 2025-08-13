package com.webApp.eStore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
@Entity
public class Product {

    @Id
    private int prodId;
    private String name;
    private int price;
    private String description;
    private String category;
    private Date releaseDate;
    private boolean availability;
    private int quantity;

    public Product(int prodId, String name, int price, String description, String category, Date releaseDate, boolean availability, int quantity){
        this.prodId = prodId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.releaseDate = releaseDate;
        this.availability = availability;
        this.quantity = quantity;
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


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
