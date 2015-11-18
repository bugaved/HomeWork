package com.sportshop.dao;

import com.sportshop.entity.SportCart;
import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopDAOException;

public class SportCartFakeDAO implements SportCartDAO {

    @Override
    public void addProductToCart(SportProduct product) throws SportShopDAOException {
        try {
            System.out.println("add product to cart");
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
    }

    @Override
    public void deleteProductFromCart(SportProduct product) throws SportShopDAOException {
        try {
            System.out.println("delete product from cart");
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
    }

    @Override
    public void buyProducts(SportCart cart) throws SportShopDAOException {
        try {
            System.out.println("buy product");
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
    }

}
