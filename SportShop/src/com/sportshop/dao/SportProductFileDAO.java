package com.sportshop.dao;

import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopDAOException;
import com.sportshop.filter.SportProductFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

abstract public class SportProductFileDAO implements SportProductDAO
{
    protected List<SportProduct> products;

    @Override
    public long addSportProduct(SportProduct user) throws SportShopDAOException {
        if(products == null) {
            loadCollection();
        }
        long userId = generateUserId();
        try {
            user.setProductId(userId);
            SportProduct sp = (SportProduct)user.clone();
            products.add(sp);
            saveCollection();
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
        return userId;
    }

    @Override
    public void updateSportProduct(SportProduct product) throws SportShopDAOException {
        if(products == null) {
            loadCollection();
        }
        SportProduct result = getUserInternal(product.getProductId());
        result.setProductName(product.getProductName());
        result.setProductDescription(product.getProductDescription());
        result.setProductPrice(product.getProductPrice());
        saveCollection();
    }

    @Override
    public void deleteSportProduct(long userId) throws SportShopDAOException {
        if(products == null) {
            loadCollection();
        }
        for(Iterator<SportProduct> it = products.iterator(); it.hasNext();) {
            SportProduct sp = it.next();
            if(sp.getProductId() == userId) {
                it.remove();
                break;
            }
        }
        saveCollection();
    }

    @Override
    public SportProduct getSportProduct(long userId) throws SportShopDAOException {
        if(products == null) {
            loadCollection();
        }
        SportProduct result = null;
        SportProduct tmp = getUserInternal(userId);
        if(tmp != null) {
            result = (SportProduct) tmp.clone();
        }
        return result;
    }

    @Override
    public List<SportProduct> findSportProducts(SportProductFilter filter) throws SportShopDAOException {
        if(products == null) {
            loadCollection();
        }
        List<SportProduct> result = new ArrayList<SportProduct>();
        for(SportProduct sp : products) {
            result.add((SportProduct) sp.clone());
        }
        return result;
    }

    private SportProduct getUserInternal(long productId) {
        SportProduct result = null;
        for(SportProduct sp : products) {
            if(sp.getProductId() == productId) {
                result = sp;
                break;
            }
        }
        return result;
    }
    
    private long generateUserId() {
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
    
    abstract protected void saveCollection() throws SportShopDAOException;
    
    abstract protected void loadCollection() throws SportShopDAOException;
}
