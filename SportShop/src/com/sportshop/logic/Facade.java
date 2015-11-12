package com.sportshop.logic;

import com.sportshop.entity.SportProduct;
import java.util.List;

public class Facade {
    private final CartManager cartMan;
    private final ClientManager clientMan;
    private final ProductManager productMan;
    private final ReviewManager reviewMan;

    public Facade() {
        cartMan = new CartManager();
        clientMan = new ClientManager();
        productMan = new ProductManager();
        reviewMan = new ReviewManager();
    }
     public long addSportProduct(SportProduct product) {
         return productMan.addSportProduct(product);
         }

    public void updateSportProduct(SportProduct productID) {
        productMan.updateSportProduct(productID);
    }

    public void deleteSportProduct(long ProductID) {
        productMan.deleteSportProduct(ProductID);
    }
      public List<SportProduct> findProducts() {
        return productMan.findProducts(); 
    }
}


    