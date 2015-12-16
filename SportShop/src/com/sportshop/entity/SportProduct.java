package com.sportshop.entity;

import java.io.Serializable;

public class SportProduct implements Serializable
{
    private long productId;
    private String productName;
    private int productPrice;
    private String productDescription;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long userId) {
        this.productId = userId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int password) {
        this.productPrice = password;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (this.productId ^ (this.productId >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SportProduct other = (SportProduct) obj;
        if (this.productId != other.productId) {
            return false;
        }
        return true;
    }

    @Override
    public Object clone() {
        SportProduct sp = new SportProduct();
        sp.setProductName(productName);
        sp.setProductDescription(productDescription);
        sp.setProductPrice(productPrice);
        sp.setProductId(productId);
        return sp;
    }

    
    
}
