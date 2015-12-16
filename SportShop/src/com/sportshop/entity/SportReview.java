package com.sportshop.entity;

public class SportReview {

    private SportClient client;
    private String reviewBody;
    private short rating;
    private long reciewID;
    private SportProduct product;

    public SportClient getClient() {
        return client;
    }

    public void setClient(SportClient client) {
        this.client = client;
    }

    public String getReviewBody() {
        return reviewBody;
    }

    public void setReviewBody(String reviewBody) {
        this.reviewBody = reviewBody;
    }

    public short getRating() {
        return rating;
    }

    public void setRating(short rating) {
        this.rating = rating;
    }

    public long getReciewID() {
        return reciewID;
    }

    public void setReciewID(long reciewID) {
        this.reciewID = reciewID;
    }

    public SportProduct getProduct() {
        return product;
    }

    public void setProduct(SportProduct product) {
        this.product = product;
    }

}