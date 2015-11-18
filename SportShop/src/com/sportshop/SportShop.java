package com.sportshop;

import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopBusinessException;
import com.sportshop.logic.Facade;
import java.util.HashSet;
import java.util.Set;

public class SportShop {

    public static void main(String[] args) throws SportShopBusinessException {
     Facade fas = new Facade();
     
     SportProduct sp= new SportProduct();
     sp.setProductName("Protein");
     sp.setPrice(100);
     sp.setDescription("Casein Protein");
     sp.setProductID(99);
     
     long productID = fas.addSportProduct(sp);
     sp.setProductID(productID);
     fas.updateSportProduct(sp);
     fas.findProducts();
     fas.deleteSportProduct(productID);
         
    }

}
