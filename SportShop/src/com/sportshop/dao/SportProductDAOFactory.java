package com.sportshop.dao;

import com.sportshop.config.SportShopSettings;
import com.sportshop.logic.DaoAnnotation;


@DaoAnnotation("daoName = com.sportshop.dao.SportProductFileSerialDAO")
public class SportProductDAOFactory
{
    public static SportProductDAO getSportProductDAO() {
        SportProductDAO dao = null;

        String className = SportShopSettings.getDaoClassName();
        if (className == null) {
            DaoAnnotation daoAn = SportProductDAOFactory.class.getAnnotation(DaoAnnotation.class);
            if (daoAn != null) {
                className = daoAn.daoName();
                System.out.println("DAO from annotation");
            }
        }
        if (className != null) {
            System.out.println("DAO from reflection");
            try {
                Class cd = Class.forName(className);
                dao = (SportProductDAO) cd.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            dao = new SportProductFakeDAO();
        }

        return dao;
    }
}
