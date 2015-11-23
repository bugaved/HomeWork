
package com.sportshop.dao;

import com.sportshop.logic.DAOAnnotation;

@DAOAnnotation(daoName = "com.sportshop.dao.SportClientFakeDAO")
public class SportClientDAOFactory {
 public static SportClientDAO getSportClientDAO() {
        SportClientDAO dao = null;
        DAOAnnotation daoAn = SportClientDAOFactory.class.getAnnotation(DAOAnnotation.class);
        if (daoAn != null) {
            String className = daoAn.daoName();

            try {
                Class cd = Class.forName(className);
                dao = (SportClientDAO) cd.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            dao = new SportClientFakeDAO();
        }
        return dao;

    }
}
