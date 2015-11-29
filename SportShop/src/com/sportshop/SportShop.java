package com.sportshop;

import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopBusinessException;
import com.sportshop.filter.SportProductFilter;
import com.sportshop.logic.Facade;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SportShop {

    public static void main(String[] args) throws SportShopBusinessException {
     Facade facade = new Facade();
     
     SportProduct sp= new SportProduct();
     sp.setProductName("Protein");
     sp.setPrice(100);
     sp.setDescription("Casein Protein");
       
     long productID = facade.addSportProduct(sp);
    List<SportProduct> lsp =  facade.findProducts(null);
    if (lsp.isEmpty()) {
        System.out.println("Error - empty List");
    }
     SportProduct productTmp = facade.getSportProduct(productID);
     if (productTmp == null) {
         System.out.println("Error - GET is not working");    
     }
     productTmp.setProductName("CHECK");     
     facade.updateSportProduct(productTmp);
     if(productTmp == null || !productTmp.getProductName().equals("CHECK")) {
         System.out.println("Error - update is not working");
     }
     facade.findProducts(null);
     facade.deleteSportProduct(productID);
     if(!lsp.isEmpty()) {
         System.out.println("error - DELETE is not working");
     }
         
    }

}
