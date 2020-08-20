/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class DBUtil {
    // ham nay de check login
    // iput : email. pass
    // output : fullname nhan vien

    public static String checkLogin(String email, String password) {
        Connection cn = null;
        try {

            // b1: tao connection
            cn = Myconnection.makeConnection();
            if (cn != null) {
                //b2: viet lenh sql can lam
                String sql = "select fullname\n"
                        + "FROM Staff \n"
                        + "WHERE email = ? and  password =? ";

                // b3 : thuc thi lenh o buoc 2
//                Statement st; neu thoong tin co san
                PreparedStatement pst = cn.prepareStatement(sql); // thong tin chua co san
                pst.setString(1, email);
    
                pst.setString(2, password);
                System.out.println(pst.toString());
                ResultSet rs = pst.executeQuery(); // dung vs lenh select
//                pst.executeUpdate(); // cac lenh con lai
            // b4 : xu ly kqua 
            // o nho dau tien va cuoi cug se la o nho dem nen null
            // xu ly tu o nho thu 2
            if(rs.next()){ // ham next ktra cham buffer o day chua
                
                String name = rs.getString("fullname");
                return name;
                
                
            }

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
               if(cn!=null) cn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

}
