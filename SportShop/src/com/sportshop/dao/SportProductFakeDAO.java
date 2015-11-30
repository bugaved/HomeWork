package com.sportshop.dao;

import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopDAOException;
import com.sportshop.filter.SportProductFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SportProductFakeDAO implements SportProductDAO {

    private List<SportProduct> products = new ArrayList<>();

    @Override
    public long addSportProduct(SportProduct product) throws SportShopDAOException {
        long productID = generateProductID();
        try {
            product.setProductID(productID);
            SportProduct sp = (SportProduct) product.clone();
            System.out.println("addSportProduct");
            products.add(sp);
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
        return productID;
    }

    @Override
    public void updateSportProduct(SportProduct product) throws SportShopDAOException {

        SportProduct result = getProductInternal(product.getProductID());
        result.setProductName(product.getProductName());
        result.setPrice(product.getPrice());
        result.setDescription(product.getDescription());
        System.out.println("updateSportProduct");
    }

    @Override
    public void deleteSportProduct(long productID) throws SportShopDAOException {
        for (Iterator<SportProduct> it = products.iterator(); it.hasNext();) {
            SportProduct sp = it.next();
            if (sp.getProductID() == productID) {
                it.remove();
                break;
            }
        }
        System.out.println("deleteSportProduct: " + productID);
    }

    @Override
    public SportProduct getSportProduct(long productID) throws SportShopDAOException {
        SportProduct result = null;
        SportProduct tmp = getProductInternal(productID);
        if (tmp != null) {
            result = (SportProduct) tmp.clone();
        }
        System.out.println("get Sport Product");
        return result;
    }

    @Override
    public List<SportProduct> findSportProducts(SportProductFilter filter) throws SportShopDAOException {

        System.out.println("find products");
        return products;

    }

    private SportProduct getProductInternal(long productID) {
        SportProduct result = null;

        for (SportProduct sp : products) {
            if (sp.getProductID() == productID) {
                result = sp;
                break;
            }
        }
        System.out.println("getSportProduct");
        return result;
    }

    private long generateProductID() {
        long productID = Math.round(Math.random() * 1000000);
        boolean found = true;
        while (found) {
            found = false;
            for (SportProduct sp : products) {
                if (sp.getProductID() == productID) {
                    found = true;
                    break;
                }
            }
            productID = Math.round(Math.random() * 1000000);
        }
        return productID;
    }
}
