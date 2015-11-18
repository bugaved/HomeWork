
package com.sportshop.dao;

import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopDAOException;
import java.util.List;


public interface SportProductDAO {
    public long addSportProduct(SportProduct product) throws SportShopDAOException;
    public void updateSportProduct(SportProduct productID) throws SportShopDAOException;
    public void deleteSportProduct(long ProductID) throws SportShopDAOException;
    public List<SportProduct> findSportProducts() throws SportShopDAOException;    
}
