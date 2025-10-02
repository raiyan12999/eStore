package com.webApp.eStore.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int prodId;
    private String name;
    private int price;
    private String description;

    @ManyToOne
    @JoinColumn(name = "Category")
    @JsonBackReference
    private Category category;
    private Date releaseDate;
    private boolean availability;
    private int quantity;
    private String brand;

    @OneToOne(mappedBy = "product")
    @JsonManagedReference
    private ProductDetails details;

    public Product(String name, int price, String description, Category category, Date releaseDate, boolean availability, int quantity, String brand){
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.releaseDate = releaseDate;
        this.availability = availability;
        this.quantity = quantity;
        this.brand = brand;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ProductDetails getDetails() {
        return details;
    }

    public void setDetails(ProductDetails details) {
        this.details = details;
    }
}
