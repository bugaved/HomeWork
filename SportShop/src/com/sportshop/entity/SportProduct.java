package com.sportshop.entity;

import java.io.Serializable;

public class SportProduct implements Serializable {

    private String productName;
    private int price;
    private String description;
    private long productID;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
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

    public long getProductID() {
        return productID;
    }

    public void setProductID(long priductID) {
        this.productID = priductID;
    }

    @Override
    public Object clone(){
       SportProduct sp = new SportProduct();
       sp.setDescription(description);
       sp.setPrice(price);
       sp.setProductID(productID);
       sp.setProductName(productName);
        return sp;
        
    }

}
