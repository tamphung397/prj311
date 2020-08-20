/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author USER
 */
public class DBUitl {

    public static String checkLogin(String email, String password) {
        Connection cn = null;
        try {

            cn = MyConnection.makeConnection();
            if (cn != null) {

                String sql = "select fullname\n"
                        + "FROM Staff \n"
                        + "WHERE email = ? and  password =? ";

                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, email);

                pst.setString(2, password);
                System.out.println(pst.toString());
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {

                    String name = rs.getString("fullname");
                    return name;

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
        return "";
    }
}
