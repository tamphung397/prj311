/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Customer;
import DTO.Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class ServiceDAO {

    public static ArrayList<Service> getService() throws SQLException {
        Connection cn = null;
        cn = MyConnection.makeConnection();
        ArrayList<Service> list = new ArrayList<>();
        if (cn != null) {
            String sql = "select ProID, PRONAME, PRICE\n"
                    + "FROM procedure";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("ProID");
                String name = rs.getString("PRONAME");
                int  price = rs.getInt("PRICE");
                Service s = new Service(id, name, price);
                list.add(s);

            }
            cn.close();
        }
        return list;
    }
}
