package com.sportshop.logic;

import com.sportshop.dao.SportReviewDAO;
import com.sportshop.dao.SportReviewDAOFactory;
import com.sportshop.entity.SportReview;
import com.sportshop.exception.SportShopBusinessException;
import com.sportshop.exception.SportShopDAOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReviewManager {

    private SportReviewDAO dao = SportReviewDAOFactory.getSportReviewDAO();

    public long addSportReview(SportReview review) throws SportShopBusinessException {
        try {
            return dao.addSportReview(review);
        } catch (SportShopDAOException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public void updateSportReview(SportReview review) throws SportShopBusinessException {
        try {
            dao.updateSportReview(review);
        } catch (SportShopDAOException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

    public void deleteSportReview(long reviewID) throws SportShopBusinessException {
        try {
            dao.deleteSportReview(reviewID);
        } catch (SportShopDAOException ex) {
            throw new SportShopBusinessException(ex);
        }
    }

}
