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
            cn = MyConnection.makeConnection();
            if (cn != null) {
                String sql = "select id, name,price,supplierId\n"
                        + "from Product";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    int price = rs.getInt("price");
                    String idSupplier = rs.getString("supplierId");
                    Product pr = new Product(id, name, price, idSupplier);
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

    public static Vector<Product> getSuplierName() {
        Vector<Product> result = new Vector<>();
        Connection cn = null;
        try {
            cn = MyConnection.makeConnection();
            if (cn != null) {
                String sql = "select  s.id,s.name\n"
                        + "from Supplier s, Product p\n"
                        + "where s.id = p.supplierId";

                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String nameOfSupplier = rs.getString("name");
                    String supplierID = rs.getString("id");
                    Product pr = new Product(supplierID, nameOfSupplier);
                    result.add(pr);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    public static Vector<Product> getfullSypplierName() {
        Vector<Product> result = new Vector<>();
        Connection cn = null;
        try {
            cn = MyConnection.makeConnection();
            if (cn != null) {
                String sql = "select name\n"
                        + "from Supplier";

                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String nameOfSupplier = rs.getString("name");

                    Product pr = new Product(nameOfSupplier);
                    result.add(pr);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {

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
            cn = MyConnection.makeConnection();
            if (cn != null) {
                String sql = "select * from Product";
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

    public static int insertProduct(String id, String name, int price, String SupplierID) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "insert Product values(?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setInt(3, price);
            pst.setString(4, SupplierID);

            result = pst.executeUpdate();
        }
        return result;
    }


    public static int deleteProduct(String id) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "Delete from Product where id = ? ";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, id);
            result = pst.executeUpdate();
        }
        return result;
    }

       public static int updateProduct(String id, String name, int price, String supplierID, String OldId) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "update product \n"
                    + "\n"
                    + "set id = ?, name = ?, price = ?, supplierId = ?\n"
                    + "where id = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setInt(3, price);
            pst.setString(4, supplierID);
            pst.setString(5, OldId);
            result = pst.executeUpdate();

        }
        return result;
    }

}
