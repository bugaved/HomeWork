package com.sportshop.dao;

import com.sportshop.entity.SportProduct;
import java.util.List;

public class SportProductFakeDAO implements SportProductDAO {

    @Override
    public long addSportProduct(SportProduct product) {
        System.out.println("addSportProduct");   
        return 99;
    }

    @Override
    public void updateSportProduct(SportProduct productID) {
        System.out.println("updateSportProduct");
    }

    @Override
    public void deleteSportProduct(long ProductID) {
        System.out.println("deleteSportProduct: " + ProductID);
    }

    @Override
    public List<SportProduct> findSportProducts() {
        System.out.println("find products");
       return null;
    }
    
}
