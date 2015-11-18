package com.sportshop.logic;

import com.sportshop.dao.SportCartDAO;
import com.sportshop.dao.SportCartDAOFactory;
import com.sportshop.entity.SportProduct;
import com.sportshop.entity.SportCart;
import com.sportshop.exception.SportShopBusinessException;
import com.sportshop.exception.SportShopDAOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CartManager {

    private SportCartDAO dao = SportCartDAOFactory.getSportCartDAO();

    public void addProductToCart(SportProduct product) throws SportShopBusinessException {
        try {
            dao.addProductToCart(product);
        } catch (SportShopDAOException ex) {
            throw new SportShopBusinessException(ex);
        }
    }
    
    public void deleteProductFromCart(SportProduct product) throws SportShopBusinessException {
        try {
            dao.deleteProductFromCart(product);
        } catch (SportShopDAOException ex) {
            throw new SportShopBusinessException(ex);
        }
    }
    
    public void buyProducts(SportCart cart) throws SportShopBusinessException {
        try {
            dao.buyProducts(cart);
        } catch (SportShopDAOException ex) {
           throw new SportShopBusinessException(ex);
        }
    }
}
