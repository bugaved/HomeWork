package com.sportshop.entity;

import java.util.Date;

public class SportClient {

    private long clientId;
    private SportProduct sportProduct;
    private String clientName;
    private String clientEmail;
    private String clientPassword;
    private int phoneNumber;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public SportProduct getSportProduct() {
        return sportProduct;
    }

    public void setSportProduct(SportProduct sportProduct) {
        this.sportProduct = sportProduct;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}