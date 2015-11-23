package com.sportshop.dao;

import com.sportshop.logic.DAOAnnotation;

@DAOAnnotation(daoName = "com.sportshop.dao.SportProductFakeDAO")
public class SportProductDAOFactory {

    public static SportProductDAO getSportProductDAO() {
        SportProductDAO dao = null;
        DAOAnnotation daoAn = SportProductDAOFactory.class.getAnnotation(DAOAnnotation.class);
        if (daoAn != null) {
            String className = daoAn.daoName();

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
