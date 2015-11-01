package com.sportshop.entity;

public class SportCart {

    private SportClient Client;
    private SportProduct product;
    private int total;
    private String CheckList;

    public SportClient getClient() {
        return Client;
    }

    public void setClient(SportClient Client) {
        this.Client = Client;
    }

    public SportProduct getProduct() {
        return product;
    }

    public void setProduct(SportProduct product) {
        this.product = product;
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
