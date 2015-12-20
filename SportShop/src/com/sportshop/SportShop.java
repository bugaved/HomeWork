package com.sportshop;

import com.sportshop.entity.SportProduct;
import com.sportshop.logic.SportShopFacade;
import java.util.List;

public class SportShop
{
    public static void main(String[] args) {
        SportShopFacade facade = new SportShopFacade();
        
        SportProduct product = new SportProduct();
        product.setProductName("productName");
        product.setProductPrice(100);
        product.setProductDescription("good product");
        
        long productId = facade.addSportProduct(product);
        List<SportProduct> sp = facade.findSportProducts(null);
        System.out.println(productId);
        if(sp.isEmpty()) {
            System.out.println("Error - list is empty");
        }
        SportProduct productTmp = facade.getSportProduct(productId);
        if(productTmp == null) {
            System.out.println("Error - GET is not working");
        }
        productTmp.setProductName("CHECK");
        facade.updateSportProduct(productTmp);
        productTmp = facade.getSportProduct(productId);
        if(productTmp == null || !productTmp.getProductName().equals("CHECK")) {
            System.out.println("Error - UPDATE is not working");
        }
        facade.deleteSportProduct(productId);
        sp = facade.findSportProducts(null);
        if(!sp.isEmpty()) {
            System.out.println("Error - DELETE is not working");
        }
    }
}
