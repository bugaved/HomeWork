package com.sportshop.entity;

public class SportProduct {

    private String productName;
    private String price;
    private String description;
    private long productID;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
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

}
