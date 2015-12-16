package com.sportshop.logic;

import com.sportshop.dao.SportProductDAO;
import com.sportshop.dao.SportProductDAOFactory;
import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopBusinessException;
import com.sportshop.exception.SportShopDAOException;
import com.sportshop.filter.SportProductFilter;
import java.util.Collections;
import java.util.List;

public class SportProductManager
{
    private SportProductDAO dao = SportProductDAOFactory.getSportProductDAO();
    
    public long addSportProduct(SportProduct product) throws SportShopBusinessException {
        try {
            return dao.addSportProduct(product
            );
        } catch (SportShopDAOException ex) {
            throw new SportShopBusinessException(ex);
        }
    }
    
    public void updateSportProduct(SportProduct product) {
        try {
            dao.updateSportProduct(product);
        } catch (SportShopDAOException ex) {
        }
    }

    public void deleteSportProduct(long productId) {
        try {
            dao.deleteSportProduct(productId);
        } catch (SportShopDAOException ex) {
        }
    }
    
    public SportProduct getSportProduct(long productId) {
        try {
            return dao.getSportProduct(productId);
        } catch (SportShopDAOException ex) {
        }
        return null;
    }
    
    public List<SportProduct> findSportProducts(SportProductFilter filter) {
        try {
            return dao.findSportProducts(filter);
        } catch (SportShopDAOException ex) {
        }
        return Collections.emptyList();
    }
}
