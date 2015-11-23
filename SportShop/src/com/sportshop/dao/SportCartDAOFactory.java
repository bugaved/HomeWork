
package com.sportshop.dao;

import com.sportshop.logic.DAOAnnotation;

@DAOAnnotation(daoName = "com.sportshop.dao.SportCartFakeDAO")
public class SportCartDAOFactory {
   public static SportCartDAO getSportCartDAO() {
        SportCartDAO dao = null;
        DAOAnnotation daoAn = SportCartDAOFactory.class.getAnnotation(DAOAnnotation.class);
        if (daoAn != null) {
            String className = daoAn.daoName();

            try {
                Class cd = Class.forName(className);
                dao = (SportCartDAO) cd.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            dao = new SportCartFakeDAO();
        }
        return dao;

    }
}
