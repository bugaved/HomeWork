package com.sportshop.dao;

import com.sportshop.entity.SportClient;
import com.sportshop.exception.SportShopDAOException;
import java.util.List;

public interface SportClientDAO {

    public long addSportClient(SportClient client) throws SportShopDAOException;

    public void updateSportClient(SportClient client) throws SportShopDAOException;

    public void banSportClient(long clientID) throws SportShopDAOException;

    public List<SportClient> findClients() throws SportShopDAOException;

}
