package com.sportshop;

import com.sportshop.entity.SportProduct;
import com.sportshop.logic.SportShopFacade;
import java.util.List;

public class SportShop
{
    public static void main(String[] args) {
        SportShopFacade facade = new SportShopFacade();
        
        SportProduct user = new SportProduct();
        user.setProductName("productName");
        user.setProductPrice(100);
        user.setProductDescription("good product");
        
        long productId = facade.addSportProduct(user);
        List<SportProduct> sp = facade.findSportProducts(null);
        if(sp.isEmpty()) {
            System.out.println("Error - list is empty");
        }
        SportProduct userTmp = facade.getSportProduct(productId);
        if(userTmp == null) {
            System.out.println("Error - GET is not working");
        }
        userTmp.setProductName("CHECK");
        facade.updateSportProduct(userTmp);
        userTmp = facade.getSportProduct(productId);
        if(userTmp == null || !userTmp.getProductName().equals("CHECK")) {
            System.out.println("Error - UPDATE is not working");
        }
        facade.deleteSportProduct(productId);
        sp = facade.findSportProducts(null);
        if(!sp.isEmpty()) {
            System.out.println("Error - DELETE is not working");
        }
    }
}
