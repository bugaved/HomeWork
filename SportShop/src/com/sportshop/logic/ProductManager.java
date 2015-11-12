package com.sportshop.logic;

import com.sportshop.dao.SportProductDAO;
import com.sportshop.dao.SportProductDAOFactory;
import java.util.List;

import com.sportshop.entity.SportProduct;

public class ProductManager {
    
    private SportProductDAO dao = SportProductDAOFactory.getSportProductDAO();

    public long addSportProduct(SportProduct product) {
       return dao.addSportProduct(product) ;
    }

    public void updateSportProduct(SportProduct productID) {
        dao.updateSportProduct(productID);
    }

    public void deleteSportProduct(long ProductID) {
        dao.deleteSportProduct(ProductID);
    }

    public List<SportProduct> findProducts() {
        return dao.findSportProducts();
    }
}
