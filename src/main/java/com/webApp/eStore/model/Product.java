package com.webApp.eStore.model;

public class Product {

    private int prodId;
    private String name;
    private int value;

    public Product(int prodId, String name, int value){
        this.prodId = prodId;
        this.name = name;
        this.value = value;
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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
