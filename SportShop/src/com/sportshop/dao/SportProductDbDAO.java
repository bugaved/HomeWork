package com.sportshop.dao;

import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopDAOException;
import com.sportshop.filter.SportProductFilter;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

public class SportProductDbDAO implements SportProductDAO {

    private static final String INSERT = "INSERT INTO sp_product (product_name, product_description, product_price) "
            + "VALUES (?, ?, ?)";
    private static final String UPDATE = "UPDATE sp_product SET product_name=?, product_description=?, product_price=? "
            + "WHERE user_id = ?";
    private static final String DELETE = "DELETE FROM sp_product WHERE product_id = ?";
    private static final String SELECT_ONE = "SELECT * FROM sp_product WHERE product_id = ?";
    private static final String SELECT_ALL = "SELECT * FROM sp_product ORDER BY product_name";
    private static final String PROP_NAME = "database.properties";
    private static String url;
    private static String login;
    private static String password;

    static {
        try {
            Properties pr = new Properties();
            pr.load(new FileReader(PROP_NAME));
            url = pr.getProperty("dao.url");
            login = pr.getProperty("dao.login");
            password = pr.getProperty("dao.password");
            Class.forName(pr.getProperty("dao.driver"));
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, login, password);
    }

    @Override
    public long addSportProduct(SportProduct product) throws SportShopDAOException {
        long productId = -1;
        try {
            Connection conn = getConnection();
            try {
                PreparedStatement stmt = conn.prepareStatement(INSERT, new String[]{"product_id"});
                stmt.setString(1, product.getProductName());
                stmt.setString(2, product.getProductDescription());
                stmt.setString(3, Integer.toString(product.getProductPrice()));
                stmt.executeUpdate();
                ResultSet gk = stmt.getGeneratedKeys();
                while (gk.next()) {
                    productId = gk.getLong(1);
                }
                gk.close();
                stmt.close();
            } finally {
                conn.close();
            }
        } catch (SQLException ex) {
            throw new SportShopDAOException(ex);
        }
        return productId;
    }

    @Override
    public void updateSportProduct(SportProduct product) throws SportShopDAOException {
        try {
            Connection conn = getConnection();
            try {
                PreparedStatement stmt = conn.prepareStatement(UPDATE);
                stmt.setString(1, product.getProductName());
                stmt.setString(2, product.getProductDescription());
                stmt.setString(3, Integer.toString(product.getProductPrice()));
                stmt.setLong(4, product.getProductId());
                stmt.executeUpdate();
                stmt.close();
            } finally {
                conn.close();
            }
        } catch (SQLException ex) {
            throw new SportShopDAOException(ex);
        }
    }

    @Override
    public void deleteSportProduct(long userId) throws SportShopDAOException {
        try {
            Connection conn = getConnection();
            try {
                PreparedStatement stmt = conn.prepareStatement(DELETE);
                stmt.setLong(1, userId);
                stmt.executeUpdate();
                stmt.close();
            } finally {
                conn.close();
            }
        } catch (SQLException ex) {
            throw new SportShopDAOException(ex);
        }
    }

    @Override
    public SportProduct getSportProduct(long productId) throws SportShopDAOException {
        SportProduct product = null;
        try {
            Connection conn = getConnection();
            try {
                PreparedStatement stmt = conn.prepareStatement(SELECT_ONE);
                stmt.setLong(1, productId);
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    product = new SportProduct();
                    product.setProductId(rs.getLong("product_id"));
                    product.setProductName(rs.getString("product_name"));
                    product.setProductDescription(rs.getString("product_description"));
                    product.setProductPrice(Integer.valueOf(rs.getString("product_price")));
                }
                rs.close();
                stmt.close();
            } finally {
                conn.close();
            }
            if (product == null) {
                throw new SportShopDAOException("No product wiwth ID:" + productId);
            }
        } catch (SQLException ex) {
            throw new SportShopDAOException(ex);
        }
        return product;
    }

    @Override
    public List<SportProduct> findSportProducts(SportProductFilter filter) throws SportShopDAOException {
        List<SportProduct> products = new LinkedList<>();
        try {
            Connection conn = getConnection();
            try {
                PreparedStatement stmt = conn.prepareStatement(SELECT_ALL);
                ResultSet rs = stmt.executeQuery();
                while (rs.next()) {
                    SportProduct product = new SportProduct();
                    product.setProductId(rs.getLong("product_id"));
                    product.setProductName(rs.getString("product_name"));
                    product.setProductDescription(rs.getString("product_description"));
                    product.setProductPrice(Integer.valueOf(rs.getString("product_price")));
                    products.add(product);
                }
                rs.close();
                stmt.close();
            } finally {
                conn.close();
            }
        } catch (SQLException ex) {
            throw new SportShopDAOException(ex);
        }
        return products;
    }

}
