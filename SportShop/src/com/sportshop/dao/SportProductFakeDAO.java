package com.sportshop.dao;

import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopDAOException;
import com.sportshop.filter.SportProductFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SportProductFakeDAO implements SportProductDAO
{
    private List<SportProduct> products = new ArrayList<SportProduct>();

    @Override
    public long addSportProduct(SportProduct user) throws SportShopDAOException {
        long productId = generateProductId();
        try {
            user.setProductId(productId);
            SportProduct sp = (SportProduct)user.clone();
            products.add(sp);
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
        return productId;
    }

    @Override
    public void updateSportProduct(SportProduct product) throws SportShopDAOException {
        SportProduct result = getProductInternal(product.getProductId());
        result.setProductName(product.getProductName());
        result.setProductDescription(product.getProductDescription());
        result.setProductPrice(product.getProductPrice());
    }

    @Override
    public void deleteSportProduct(long productId) throws SportShopDAOException {
        for(Iterator<SportProduct> it = products.iterator(); it.hasNext();) {
            SportProduct sp = it.next();
            if(sp.getProductId() == productId) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public SportProduct getSportProduct(long productId) throws SportShopDAOException {
        SportProduct result = null;
        SportProduct tmp = getProductInternal(productId);
        if(tmp != null) {
            result = (SportProduct) tmp.clone();
        }
        return result;
    }

    @Override
    public List<SportProduct> findSportProducts(SportProductFilter filter) throws SportShopDAOException {
        List<SportProduct> result = new ArrayList<SportProduct>();
        for(SportProduct sp : products) {
            result.add((SportProduct) sp.clone());
        }
        return result;
    }

    private SportProduct getProductInternal(long productId) {
        SportProduct result = null;
        for(SportProduct sp : products) {
            if(sp.getProductId() == productId) {
                result = sp;
                break;
            }
        }
        return result;
    }
    
    private long generateProductId() {
        long productId = Math.round(Math.random() * 1000000);
        boolean found = true;
        while (found) {
            found = false;
            for (SportProduct sp : products) {
                if (sp.getProductId() == productId) {
                    found = true;
                    break;
                }
            }
            productId = Math.round(Math.random() * 1000000);
        }
        return productId;
    }
}
