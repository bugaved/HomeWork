package com.sportshop.dao;

import com.sportshop.entity.SportClient;
import com.sportshop.exception.SportShopDAOException;
import java.util.List;

public class SportClientFakeDAO implements SportClientDAO {

    @Override
    public long addSportClient(SportClient client) throws SportShopDAOException {
        try {
            System.out.println("addSportClient");
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
        return 11;
    }

    @Override
    public void updateSportClient(SportClient client) throws SportShopDAOException {
        try {
            System.out.println("updateSportClient");
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
    }

    @Override
    public void banSportClient(long clientID) throws SportShopDAOException {
        try {
            System.out.println("banSportSlient " + clientID);
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
    }

    @Override
    public List<SportClient> findClients() throws SportShopDAOException {
        try {
            System.out.println("find Clients");
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
        return null;
    }

}
