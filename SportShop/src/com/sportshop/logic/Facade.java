package com.sportshop.logic;

import com.sportshop.entity.SportCart;
import com.sportshop.entity.SportClient;
import com.sportshop.entity.SportProduct;
import com.sportshop.entity.SportReview;
import com.sportshop.exception.SportShopBusinessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Facade {

    private final CartManager cartMan;
    private final ClientManager clientMan;
    private final ProductManager productMan;
    private final ReviewManager reviewMan;

    public Facade() {
        cartMan = new CartManager();
        clientMan = new ClientManager();
        productMan = new ProductManager();
        reviewMan = new ReviewManager();
    }

    public long addSportProduct(SportProduct product) throws SportShopBusinessException {
        try {
            return productMan.addSportProduct(product);
        } catch (SportShopBusinessException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public void updateSportProduct(SportProduct product) throws SportShopBusinessException {
        try {
            productMan.updateSportProduct(product);
        } catch (SportShopBusinessException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public void deleteSportProduct(long productID) throws SportShopBusinessException {
        try {
            productMan.deleteSportProduct(productID);
        } catch (SportShopBusinessException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public List<SportProduct> findProducts() throws SportShopBusinessException {
        try {
            return productMan.findProducts();
        } catch (SportShopBusinessException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public long addSportClient(SportClient client) throws SportShopBusinessException {
        try {
            return clientMan.addSportClient(client);
        } catch (SportShopBusinessException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public void updateSportClient(SportClient client) throws SportShopBusinessException {
        try {
            clientMan.updateSportClient(client);
        } catch (SportShopBusinessException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public void banSportClient(long clientID) throws SportShopBusinessException {
        try {
            clientMan.banSportClient(clientID);
        } catch (SportShopBusinessException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public List<SportClient> findClients() throws SportShopBusinessException {
        try {
            return clientMan.findClients();
        } catch (SportShopBusinessException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public void addProductToCart(SportProduct product) throws SportShopBusinessException {
        try {
            cartMan.addProductToCart(product);
        } catch (SportShopBusinessException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public void deleteProductFromCart(SportProduct product) throws SportShopBusinessException {
        try {
            cartMan.deleteProductFromCart(product);
        } catch (SportShopBusinessException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public void buyProducts(SportCart cart) throws SportShopBusinessException {
        try {
            cartMan.buyProducts(cart);
        } catch (SportShopBusinessException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public long addSportReview(SportReview review) throws SportShopBusinessException {
        try {
            return reviewMan.addSportReview(review);
        } catch (SportShopBusinessException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public void updateSportReview(SportReview review) throws SportShopBusinessException {
        try {
            reviewMan.updateSportReview(review);
        } catch (SportShopBusinessException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public void deleteSportReview(long reviewID) throws SportShopBusinessException {
        try {
            reviewMan.deleteSportReview(reviewID);
        } catch (SportShopBusinessException ex) {
            throw new SportShopBusinessException(ex);
        }
    }
}
