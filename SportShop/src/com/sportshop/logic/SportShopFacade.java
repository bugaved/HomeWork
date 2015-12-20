package com.sportshop.logic;

import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopBusinessException;
import com.sportshop.filter.SportProductFilter;
import com.sportshop.logic.SportCartManager;
import com.sportshop.logic.SportClientManager;
import com.sportshop.logic.SportProductManager;
import java.util.List;

public class SportShopFacade
{
    private final SportProductManager productManager;
    private final SportClientManager clientManager;
    private final SportCartManager cartManager;

    public SportShopFacade() {
        productManager = new SportProductManager();
        clientManager = new SportClientManager();
        cartManager = new SportCartManager();
    }
    
    public long addSportProduct(SportProduct product) {
        try {
            return productManager.addSportProduct(product);
        } catch (SportShopBusinessException ex) {
        }
        return 0;
    }
    
    public void updateSportProduct(SportProduct product) {
        productManager.updateSportProduct(product);
    }

    public void deleteSportProduct(long productId) {
        productManager.deleteSportProduct(productId);
    }
    
    public SportProduct getSportProduct(long productId) {
        return productManager.getSportProduct(productId);
    }
    
    public List<SportProduct> findSportProducts(SportProductFilter filter) {
        return productManager.findSportProducts(filter);
    }
    
}
