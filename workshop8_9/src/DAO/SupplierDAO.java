/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Supplier;
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

    public static Vector<Supplier> getSupplier() {
        Vector<Supplier> result = new Vector<>();
        Connection cn = null;
        try {
            cn = MyConnection.makeConnection();
            if (cn != null) {
                String sql = "select id,name\n"
                        + "from Supplier";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    Supplier sp = new Supplier(id, name);
                    result.add(sp);
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

    public static Vector<String> getColumnName() {
        Vector<String> header = new Vector<>();
        Connection cn = null;
        try {
            cn = MyConnection.makeConnection();
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

    public static int insertSupplier(String id, String name) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "insert supplier values(?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, name);

            result = pst.executeUpdate();
        }
        return result;
    }
     public static Vector<Supplier> getfullSupplierId() {
        Vector<Supplier> result = new Vector<>();
        Connection cn = null;
        try {
            cn = MyConnection.makeConnection();
            if (cn != null) {
                String sql = "SELECT ID FROM Supplier";

                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                while (rs.next()) {
                    String ID = rs.getString("ID");

                    Supplier pr = new Supplier(ID);
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

    public static int updateSupplier(String id, String name, String oldID) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "update Supplier\n"
                    + "set id = ? , name = ?\n"
                    + "where id = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, name);

            pst.setString(3, oldID);
            result = pst.executeUpdate();
        }
        return result;
    }

    public static int deleteSuplier(String id, String name) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
    
            if (cn != null) {
                String sql = "Delete from Supplier where id = ? ";
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, id);
                result = pst.executeUpdate();
            }
      
        return result;
    }

}
