package com.sportshop.dao;

import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopDAOException;
import com.sportshop.filter.SportProductFilter;
import java.util.List;

public interface SportProductDAO
{
    public long addSportProduct(SportProduct user) throws SportShopDAOException;
    public void updateSportProduct(SportProduct user) throws SportShopDAOException;
    public void deleteSportProduct(long userId) throws SportShopDAOException;
    public SportProduct getSportProduct(long userId) throws SportShopDAOException;
    public List<SportProduct> findSportProducts(SportProductFilter filter) throws SportShopDAOException;
}
