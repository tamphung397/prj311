/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_sql;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
//public class DBAAcess {
//
//    // try to establish a connection with sql server
//    private static Connection makeConnection() {
//        Connection cn = null;
//        try {
//            //b1: tao driver
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String url = "jdbc:sqlserver://localhost:1433;databasename=SE1425";
//
//            cn = DriverManager.getConnection(url, "sa", "123");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return cn;
//
//    }
//
//    public void printData() {
//        Connection newCon = makeConnection();
//        try {
//            // Create s statement
//            Statement sm = newCon.createStatement();
//            // Run the SQL query and hold the return dataset into result set
//            ResultSet rst = sm.executeQuery("Select *\n"
//                        + "from Supplier");
//            ResultSetMetaData rstm = rst.getMetaData();
//
//            // let pull out and print the Header
//            int cols = rstm.getColumnCount();
//            String[] colsNames = null ;
//            for (int i = 1; i <= cols; i++) {
//                colsNames[i - 1] = rstm.getColumnName(i);
//            }
//            System.out.println(Arrays.asList(colsNames));
//            while(rst.next()){
//                Vector<String> recode = new Vector<>();
//                for(int i = 0; i <= cols; i++){
//                    recode.add(rst.getString(i));
//                }
//                System.out.println(recode);
//            }
//            rst.close();
//            sm.close();
//            newCon.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(DBAAcess.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
//    
//       public static Vector<String> getColumnName() {
//        Vector<String> header = new Vector<>();
//        Connection cn = null;
//        try {
//            cn = makeConnection();
//            if (cn != null) {
//                String sql = "Select *\n"
//                        + "from Supplier";
//                PreparedStatement pst = cn.prepareStatement(sql);
//                
//                ResultSet rs = pst.executeQuery();
//                ResultSetMetaData meta = rs.getMetaData();  //lay cau truc du lieu trong database
//                for(int index = 1; index <= meta.getColumnCount();index++){
//                    header.add(meta.getColumnName(index));
//                }
//              
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (cn != null) {
//                    cn.close();
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return header;
//    }
//}
public class DBAAcess {

    public Connection getCon() throws ClassNotFoundException {
        Connection con = null;
        //Define our connection string 
        String conStr = "jdbc:sqlserver://localhost:1433; " +"databaseName=se1425;" +"  user=sa; password=123";
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

        Class.forName(driver);
        try {
            con = DriverManager.getConnection(conStr);
            if (con != null) {
                System.out.println("Connection successfull.");

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBAAcess.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }

    public void printData() throws ClassNotFoundException {
        Connection newCon = getCon();
        try {
            Statement stm = newCon.createStatement();
            //run the sql query and hold the returned dât set into the resultset
            ResultSet rst = stm.executeQuery("select *from supplier");
            ResultSetMetaData rstm = rst.getMetaData();
            //lets pull out and print the headers
            int cols = rstm.getColumnCount();
            String[] colNames = new String[cols];

            for (int i = 1; i <= cols; i++) {
                colNames[i - 1] = rstm.getColumnName(i);
            }
            System.out.println(Arrays.asList(colNames));
            //
            //print the data/records

            while (rst.next()) {
                Vector<String> records = new Vector<String>();
                for (int i = 1; i <= cols; i++) {
                    records.add(rst.getString(i));
                }
                System.out.println(records);
            }
            rst.close();
            stm.close();
            newCon.close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAAcess.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public DefaultTableModel getData() throws ClassNotFoundException{
        DefaultTableModel model = new DefaultTableModel();
        Connection con = getCon();
        Statement stm;
        try {
            stm = con.createStatement();
            ResultSet rs = stm.executeQuery("Select * from supplier");
            ResultSetMetaData rsm = rs.getMetaData();
            int colCount = rsm.getColumnCount();
            for(int i = 1 ; i <= colCount; i++){
                model.addColumn(rsm.getColumnName(i));
            }
            while(rs.next()){
                Object[] row = new Object[colCount];
                for(int i = 1 ; i < colCount; i++){
                    row[i-1] = rs.getString(i);
                    
                }
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBAAcess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;
        
    }
}
