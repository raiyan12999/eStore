package com.webApp.eStore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import org.springframework.stereotype.Component;

@Component
@Entity
public class ProductDetails {

    @Id
    private int productId; // Shares same id as product
    private String weight;
    private String dimension;

    @OneToOne
    @MapsId
    private Product product;

    public ProductDetails(){

    }

    public ProductDetails(String weight, String dimension){
        this.weight = weight;
        this.dimension = dimension;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
