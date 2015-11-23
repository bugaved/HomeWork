package com.sportshop.logic;

import com.sportshop.dao.SportClientDAO;
import com.sportshop.dao.SportClientDAOFactory;
import java.util.List;

import com.sportshop.entity.SportClient;
import com.sportshop.exception.SportShopBusinessException;
import com.sportshop.exception.SportShopDAOException;
import com.sportshop.filter.SportClientFilter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientManager {

    private SportClientDAO dao = SportClientDAOFactory.getSportClientDAO();

    public long addSportClient(SportClient client) throws SportShopBusinessException {
        try {
            return dao.addSportClient(client);
        } catch (SportShopDAOException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public void updateSportClient(SportClient client) throws SportShopBusinessException {
        try {
            dao.updateSportClient(client);
        } catch (SportShopDAOException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public void banSportClient(long clientID) throws SportShopBusinessException {
        try {
            dao.banSportClient(clientID);
        } catch (SportShopDAOException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public List<SportClient> findClients(SportClientFilter filter) throws SportShopBusinessException {
        try {
            return dao.findClients(filter);
        } catch (SportShopDAOException ex) {
           throw new SportShopBusinessException(ex);
        }
    }
}
