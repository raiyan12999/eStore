package com.webApp.eStore.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tagId;
    private String tagName;

    @ManyToMany(mappedBy = "tags")
    @JsonIgnore
    private List<Product> products = new ArrayList<>();

    public Tag(){

    }

    public Tag(int id, String name){

        this.tagId = id;
        this.tagName = name;
    }

    public int getTagId(){
        return tagId;
    }

    public void setTagId(int id){
        this.tagId = id;
    }

    public String getTagName(){
        return tagName;
    }

    public void setTagName(String name){
        this.tagName = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
