/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author USER
 */
public class ProductDAO {

    public static Vector<Product> getProduct() {
        Vector<Product> result = new Vector<>();
        Connection cn = null;
        try {
            cn = Myconnection.makeConnection();
            if (cn != null) {
                String sql = "select ID,Name,Price\n"
                        + "from Product";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("ID");
                    String name = rs.getString("Name");
                    float price = rs.getFloat("Price");

                    Product pr = new Product(id, name, price);
                    result.add(pr);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static Vector<String> getcolumnProduct() {
        Vector<String> header = new Vector<>();
        Connection cn = null;
        try {
            cn = Myconnection.makeConnection();
            if (cn != null) {
                String sql = "select *\n"
                        + "from Product";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData meta = rs.getMetaData();
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    header.add(meta.getColumnName(i));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                if (cn != null) {
                    cn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return header;
    }
     public static int insertProduct(int id, String name, float price) throws SQLException {
        Connection cn = Myconnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "insert Product values(?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setFloat(3, price);
     

            result = pst.executeUpdate();
        }
        return result;
    }
     
  
}
