package com.sportshop.dao;

import com.sportshop.config.SportShopSettings;
import com.sportshop.entity.SportProduct;
import com.sportshop.exception.SportShopDAOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SportProductFileCommaDAO extends SportProductFileDAO {

    @Override
    protected void saveCollection() throws SportShopDAOException {
        try {
            FileWriter fw = new FileWriter(SportShopSettings.getProperty(SportShopSettings.FILE_NAME_COMMA));
            try {
                BufferedWriter bw = new BufferedWriter(fw);
                for (SportProduct sp : products) {
                    bw.write(sp.getProductID() + "," + sp.getProductName() + "," + sp.getPrice() + "," + sp.getDescription()
                            + System.lineSeparator());
                }
                bw.close();
            } finally {
                fw.close();
            }
        } catch (IOException ex) {
            throw new SportShopDAOException(ex);
        }
    }

    @Override
    protected void loadCollection() throws SportShopDAOException {
        products = new ArrayList<>();
        try {
            FileReader fr = new FileReader(SportShopSettings.getProperty(SportShopSettings.FILE_NAME_COMMA));
            try {
                BufferedReader br = new BufferedReader(fr);
                String line = null;
                while ((line = br.readLine()) != null) {
                    String[] params = line.split("\\s*,\\s*");
                    SportProduct sp = new SportProduct();
                    sp.setProductID(Long.parseLong(params[0]));
                    sp.setProductName(params[1]);
                    Integer i1 = new Integer(params[2]);
                    sp.setPrice(i1);
                    sp.setDescription(params[3]);
                    products.add(sp);
                }
            } finally {
                fr.close();
            }
        } catch (IOException ex) {
        }
    }

}
