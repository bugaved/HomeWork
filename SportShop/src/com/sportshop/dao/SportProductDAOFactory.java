
package com.sportshop.dao;

public class SportProductDAOFactory {
    public static SportProductDAO getSportProductDAO() {
        return new SportProductFakeDAO();
    }
}
