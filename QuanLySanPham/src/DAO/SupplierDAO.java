/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Product;
import DTO.Supplier;
import com.sun.swing.internal.plaf.metal.resources.metal;
import java.io.PrintWriter;
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
public class SupplierDAO {

    // HAM NAY DE LAY CAC RECODE TRONG BANG SUPPLIER TRA VE VECTOR CAC SUPPLIER
    public static Vector<Supplier> getSupplier() {
        Vector<Supplier> result = new Vector<>();
        Connection cn = null;
        try {
            cn = Myconnection.makeConnection();
            if (cn != null) {
                String sql = "Select id,name\n"
                        + "from Supplier";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    Supplier s = new Supplier(id, name); // add tung dong vao vector

                    result.add(s);
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

    public static Vector<Product> getProduct() {
        Vector<Product> result = new Vector<>();
        Connection cn = null;
        try {
            cn = Myconnection.makeConnection();
            if (cn != null) {
                String sql = "	select  i.id, i.name,i.price,s.name as 'Name of supplier'\n"
                        + "from Supplier s, item i\n"
                        + "where s.id = i.supplierId";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    int price = rs.getInt("Price");
                    String nameOfSupplier = rs.getString("Name of supplier");
                    Product pr = new Product(id, name, price, nameOfSupplier);
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

    // ham nay de lay ten cac cot cua bang supplier trongdatata base 
    // tra ve danh sach
    public static Vector<String> getColumnName() {
        Vector<String> header = new Vector<>();
        Connection cn = null;
        try {
            cn = Myconnection.makeConnection();
            if (cn != null) {
                String sql = "Select *\n"
                        + "from Supplier";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData meta = rs.getMetaData();  //lay cau truc du lieu trong database
                for (int index = 1; index <= meta.getColumnCount(); index++) {
                    header.add(meta.getColumnName(index));
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

    public static Vector<String> getColumProduct() {
        Vector<String> header = new Vector<>();
        Connection cn = null;
        try {
            cn = Myconnection.makeConnection();
            if (cn != null) {
                String sql = "	select  i.id, i.name,i.price,s.name as 'Name of supplier'\n"
                        + "from Supplier s, item i\n"
                        + "where s.id = i.supplierId";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData meta = rs.getMetaData();
                for (int index = 1; index <= meta.getColumnCount(); index++) {
                    header.add(meta.getColumnName(index));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return header;
    }

    // ham nay de chen ID , name cho bang supplier, tra ve 1 neu thanh cong 0 neu that bai
    public static int insertSupplier(int id, String name) throws SQLException {
        Connection cn = Myconnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "insert supplier values(?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, name);

            result = pst.executeUpdate();
        }
        return result;
    }

    public static int insertProduct(int id, String name, int price, int supplierID) throws SQLException {
        Connection cn = Myconnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "insert into item values(?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, price);
            pst.setInt(4, supplierID);
            result = pst.executeUpdate();
        }
        return result;
    }

    public static int deleteSuplier(int id, String name) throws SQLException {
        Connection cn = Myconnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "Delete from Supplier where id = ? and name = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, name);

            result = pst.executeUpdate();
        }
        return result;
    }

    public static int updateSupplier(int id, String name, int oldID) throws SQLException {
        Connection cn = Myconnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "update Supplier\n"
                    + "set id = ? , name = ?\n"
                    + "where id = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, name);

            pst.setInt(3, oldID);
            result = pst.executeUpdate();
        }
        return result;
    }

  

    public static int updateProduct(int id, String name, int price, int supplierID, int OldId) throws SQLException {
        Connection cn = Myconnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "update item \n"
                    + "\n"
                    + "set id = ?, name = ?, price = ?, supplierId = ?\n"
                    + "where id = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setInt(3, price);
            pst.setInt(4, supplierID);
            pst.setInt(5, OldId);
            result = pst.executeUpdate();

        }
        return result;
    }

    public static void Writefle(String filename, Vector<Supplier> list, String nameOfStaff) {
        PrintWriter w = null;
        try {
            w = new PrintWriter(filename);

            w.println("CTYTNHH" + " " + nameOfStaff);
            w.println("Bao cao Nha cung cap");
            w.println("STT ID NAME");
            int count = 1;
            for (int i = 0; i < list.size(); i++) {
                w.println(count + " " + list.get(i).getId() + " " + list.get(i).getName());
                count++;
            }

        } catch (Exception e) {
        } finally {
            try {
                w.close();
            } catch (Exception e) {
            }
        }
    }

}
