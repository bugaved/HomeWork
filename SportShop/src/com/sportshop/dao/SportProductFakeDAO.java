package com.sportshop.dao;

import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopDAOException;
import com.sportshop.filter.SportProductFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SportProductFakeDAO implements SportProductDAO
{
    private List<SportProduct> users = new ArrayList<SportProduct>();

    @Override
    public long addSportProduct(SportProduct user) throws SportShopDAOException {
        long userId = generateProductId();
        try {
            user.setProductId(userId);
            SportProduct lu = (SportProduct)user.clone();
            users.add(lu);
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
        return userId;
    }

    @Override
    public void updateSportProduct(SportProduct user) throws SportShopDAOException {
        SportProduct result = getUserInternal(user.getProductId());
        result.setProductName(user.getProductName());
        result.setProductDescription(user.getProductDescription());
        result.setProductPrice(user.getProductPrice());
    }

    @Override
    public void deleteSportProduct(long userId) throws SportShopDAOException {
        for(Iterator<SportProduct> it = users.iterator(); it.hasNext();) {
            SportProduct lu = it.next();
            if(lu.getProductId() == userId) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public SportProduct getSportProduct(long userId) throws SportShopDAOException {
        SportProduct result = null;
        SportProduct tmp = getUserInternal(userId);
        if(tmp != null) {
            result = (SportProduct) tmp.clone();
        }
        return result;
    }

    @Override
    public List<SportProduct> findSportProducts(SportProductFilter filter) throws SportShopDAOException {
        List<SportProduct> result = new ArrayList<SportProduct>();
        for(SportProduct lu : users) {
            result.add((SportProduct) lu.clone());
        }
        return result;
    }

    private SportProduct getUserInternal(long userId) {
        SportProduct result = null;
        for(SportProduct lu : users) {
            if(lu.getProductId() == userId) {
                result = lu;
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
            for (SportProduct sp : users) {
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
