package com.sportshop.logic;

import com.sportshop.dao.SportProductDAO;
import com.sportshop.dao.SportProductDAOFactory;
import java.util.List;

import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopBusinessException;
import com.sportshop.exception.SportShopDAOException;
import com.sportshop.filter.SportProductFilter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductManager {

    private SportProductDAO dao = SportProductDAOFactory.getSportProductDAO();

    public long addSportProduct(SportProduct product) throws SportShopBusinessException {
        try {
            return dao.addSportProduct(product);
        } catch (SportShopDAOException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public void updateSportProduct(SportProduct productID) throws SportShopBusinessException {
        try {
            dao.updateSportProduct(productID);
        } catch (SportShopDAOException ex) {
            Logger.getLogger(ProductManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteSportProduct(long productID) throws SportShopBusinessException {
        try {
            dao.deleteSportProduct(productID);
        } catch (SportShopDAOException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public List<SportProduct> findProducts(SportProductFilter filter) throws SportShopBusinessException {
        try {
            return dao.findSportProducts(filter);
        } catch (SportShopDAOException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public SportProduct getSportProduct(long productID) throws SportShopBusinessException {
        try {
            return dao.getSportProduct(productID);
        } catch (SportShopDAOException ex) {
            throw new SportShopBusinessException(ex);

        }

    }
}
