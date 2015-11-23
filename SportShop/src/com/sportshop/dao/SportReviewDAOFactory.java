package com.sportshop.dao;

import com.sportshop.logic.DAOAnnotation;

@DAOAnnotation(daoName = "com.sportshop.dao.SportReviewFakeDAO")
public class SportReviewDAOFactory {
   public static SportReviewDAO getSportReviewDAO() {
        SportReviewDAO dao = null;
        DAOAnnotation daoAn = SportReviewDAOFactory.class.getAnnotation(DAOAnnotation.class);
        if (daoAn != null) {
            String className = daoAn.daoName();

            try {
                Class cd = Class.forName(className);
                dao = (SportReviewDAO) cd.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            dao = new SportReviewFakeDAO();
        }
        return dao;

    }
}
