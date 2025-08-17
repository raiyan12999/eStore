package com.webApp.eStore.model;

import jakarta.persistence.*;
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

    @ManyToOne
    private Category category;
    private Date releaseDate;
    private boolean availability;
    private int quantity;
    private String brand;

    public Product(int prodId, String name, int price, String description, Category category, Date releaseDate, boolean availability, int quantity, String brand){
        this.prodId = prodId;
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

    @OneToOne(mappedBy = "product")
    private ProductDetails productDetails;


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

    public ProductDetails getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(ProductDetails productDetails) {
        this.productDetails = productDetails;
    }
}
