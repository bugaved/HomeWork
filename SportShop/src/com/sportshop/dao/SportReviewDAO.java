package com.sportshop.dao;

import com.sportshop.entity.SportReview;
import com.sportshop.exception.SportShopDAOException;

public interface SportReviewDAO {

    public long addSportReview(SportReview review) throws SportShopDAOException;

    public void updateSportReview(SportReview review) throws SportShopDAOException;

    public void deleteSportReview(long reviewID) throws SportShopDAOException;
}
