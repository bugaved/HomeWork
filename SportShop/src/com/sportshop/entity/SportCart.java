package com.sportshop.entity;

public class SportCart
{
    private long CartId;
    private SportProduct product;
    private SportClient client;
    private int total;
    private String CheckList;

    public long getCartId() {
        return CartId;
    }

    public void setCartId(long CartId) {
        this.CartId = CartId;
    }

    public SportProduct getProduct() {
        return product;
    }

    public void setProduct(SportProduct product) {
        this.product = product;
    }

    public SportClient getClient() {
        return client;
    }

    public void setClient(SportClient client) {
        this.client = client;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getCheckList() {
        return CheckList;
    }

    public void setCheckList(String CheckList) {
        this.CheckList = CheckList;
    }
}