package com.sportshop.dao;

import com.sportshop.entity.SportReview;
import com.sportshop.exception.SportShopDAOException;

public class SportReviewFakeDAO implements SportReviewDAO {

    @Override
    public long addSportReview(SportReview review) throws SportShopDAOException {
        try {
            System.out.println("addSportReview");
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
        return 22;
    }

    @Override
    public void updateSportReview(SportReview review) throws SportShopDAOException {
        try {
            System.out.println("updateSportReview");
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
    }

    @Override
    public void deleteSportReview(long reviewID) throws SportShopDAOException {
        try {
            System.out.println("deleteSportReview " + reviewID);
        } catch (Exception ex) {
            throw new SportShopDAOException(ex);
        }
    }

}
