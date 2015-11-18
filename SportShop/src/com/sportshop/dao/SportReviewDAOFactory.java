package com.sportshop.dao;

public class SportReviewDAOFactory {

    public static SportReviewDAO getSportReviewDAO() {
        return new SportReviewFakeDAO();
    }
}
