/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Customer;
import DTO.Pet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class PetDAO {

    public static ArrayList<Pet> getPets(int onwnerID) throws SQLException {
        Connection cn = null;
        cn = MyConnection.makeConnection();
        ArrayList<Pet> list = new ArrayList<>();
        if (cn != null) {
            String sql = "select petID, petName,age,OwneID, typeID\n"
                    + "from PET\n"
                    + "where OwneID = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setInt(1, onwnerID);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("Pet ID");
                String name = rs.getString("petName");
                int age = rs.getInt("age");
                int onwerID = rs.getInt("OwneID");
                int typeID = rs.getInt("typeID");
                Pet p = new Pet(id, name, age, onwnerID, typeID);
                list.add(p);

            }
            cn.close();
        }
        return list;
    }
}
