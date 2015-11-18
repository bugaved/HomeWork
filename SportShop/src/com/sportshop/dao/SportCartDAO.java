package com.sportshop.dao;

import com.sportshop.entity.SportCart;
import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopDAOException;

public interface SportCartDAO {

    public void addProductToCart(SportProduct product) throws SportShopDAOException;

    public void deleteProductFromCart(SportProduct product) throws SportShopDAOException;

    public void buyProducts(SportCart cart) throws SportShopDAOException;
}
