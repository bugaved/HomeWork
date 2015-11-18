
package com.sportshop.dao;

public class SportCartDAOFactory {
      public static SportCartDAO getSportCartDAO() {
        return new SportCartFakeDAO();
    }
}
