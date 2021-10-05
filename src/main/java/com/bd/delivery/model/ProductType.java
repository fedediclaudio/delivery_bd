package com.bd.delivery.model;

public class ProductType {

    private String productTypeName;

    private float price;

    public ProductType(){}

    public ProductType(String name, float price){
        this.productTypeName = name;
        this.price = price;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
