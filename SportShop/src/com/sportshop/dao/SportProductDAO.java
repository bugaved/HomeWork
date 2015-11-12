
package com.sportshop.dao;

import com.sportshop.entity.SportProduct;
import java.util.List;


public interface SportProductDAO {
    public long addSportProduct(SportProduct product);
    public void updateSportProduct(SportProduct productID);
    public void deleteSportProduct(long ProductID);
    public List<SportProduct> findSportProducts();    
}
