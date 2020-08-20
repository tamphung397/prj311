/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class CustomerDAO {

    public static ArrayList<Customer> getCustomer() throws SQLException {
        Connection cn = null;
        cn = MyConnection.makeConnection();
        ArrayList<Customer> list = new ArrayList<>();
        if (cn != null) {
            String sql = "select OwneID,OwnerName,Address\n"
                    + "from Owner";
            PreparedStatement pst = cn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("OWNER ID");
                String name = rs.getString("OWNER NAME");
                String address = rs.getString("OWNER ADDRESS");
                Customer c = new Customer(id, name, address);
                list.add(c);

            }
            cn.close();
        }
        return list;
    }
}
