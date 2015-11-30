package com.sportshop.dao;

import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopDAOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SportProductFileSerialDAO extends SportProductFileDAO {

    private static final String FILE_NAME = "users.bin";

    @Override
    protected void saveCollection() throws SportShopDAOException {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            try {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            } finally {
                fos.close();
            }
        } catch (IOException ex) {
            throw new SportShopDAOException(ex);
        }
    }

    @Override
    protected void loadCollection() throws SportShopDAOException {
        try {
            FileInputStream fis = new FileInputStream(FILE_NAME);
            try {
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<SportProduct>)ois.readObject();
            } catch (ClassNotFoundException ex) {
                throw new SportShopDAOException(ex);
            } finally {
                fis.close();
            }
        } catch (IOException ex) {
            throw new SportShopDAOException(ex);
        }
    }

}
