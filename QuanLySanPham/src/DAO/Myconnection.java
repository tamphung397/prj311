/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author USER
 */
public class Myconnection {

    public static Connection makeConnection() {
        Connection cn = null;
        try {
            //b1: tao driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databasename=SE1425";
         
            
            cn = DriverManager.getConnection(url, "sa","123");
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        return cn;

    }
  
    
   
}
