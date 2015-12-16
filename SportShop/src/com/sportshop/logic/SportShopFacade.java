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
    
    public long addSportProduct(SportProduct user) {
        try {
            return productManager.addSportProduct(user);
        } catch (SportShopBusinessException ex) {
        }
        return 0;
    }
    
    public void updateSportProduct(SportProduct user) {
        productManager.updateSportProduct(user);
    }

    public void deleteSportProduct(long userId) {
        productManager.deleteSportProduct(userId);
    }
    
    public SportProduct getSportProduct(long userId) {
        return productManager.getSportProduct(userId);
    }
    
    public List<SportProduct> findSportProducts(SportProductFilter filter) {
        return productManager.findSportProducts(filter);
    }
    
}
