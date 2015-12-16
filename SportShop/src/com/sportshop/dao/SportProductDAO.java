package com.sportshop.dao;

import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopDAOException;
import com.sportshop.filter.SportProductFilter;
import java.util.List;

public interface SportProductDAO
{
    public long addSportProduct(SportProduct productId) throws SportShopDAOException;
    public void updateSportProduct(SportProduct productId) throws SportShopDAOException;
    public void deleteSportProduct(long productId) throws SportShopDAOException;
    public SportProduct getSportProduct(long productId) throws SportShopDAOException;
    public List<SportProduct> findSportProducts(SportProductFilter filter) throws SportShopDAOException;
}
