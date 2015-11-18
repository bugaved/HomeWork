package com.sportshop.dao;

import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopDAOException;
import java.util.List;

public class SportProductFakeDAO implements SportProductDAO {

    @Override
    public long addSportProduct(SportProduct product) throws SportShopDAOException {
        try {
            System.out.println("addSportProduct");
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
        return 99;
    }

    @Override
    public void updateSportProduct(SportProduct product) throws SportShopDAOException {
        try {
            System.out.println("updateSportProduct");
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
    }

    @Override
    public void deleteSportProduct(long productID) throws SportShopDAOException {
        try {
            System.out.println("deleteSportProduct: " + productID);
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
    }

    @Override
    public List<SportProduct> findSportProducts() throws SportShopDAOException {
        try {
            System.out.println("find products");
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
        return null;
    }

}
