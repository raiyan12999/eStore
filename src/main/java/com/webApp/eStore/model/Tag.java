package com.webApp.eStore.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Entity
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tagId;
    private String tagName;

    @ManyToMany(mappedBy = "tags")
    @JsonManagedReference
    private ArrayList<Product> products = new ArrayList<>();

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

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
