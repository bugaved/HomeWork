
package com.sportshop.dao;

public class SportClientDAOFactory {
       public static SportClientDAO getSportClientDAO() {
        return new SportClientFakeDAO();
    }
}
