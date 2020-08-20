/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpe1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
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
public class EmployeeServer extends UnicastRemoteObject implements EmployeeInterface {

    public EmployeeServer() throws RemoteException {
    }

    @Override
    public Vector<Employee> getSupplier() throws RemoteException {
        Vector<Employee> result = new Vector<>();
        Connection cn = null;
        try {
            cn = MyConnection.makeConnection();
            if (cn != null) {
                String sql = "select id,name,age,salary from employee";
                PreparedStatement pst = cn.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    String id = rs.getString("id");
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    int salary = rs.getInt("salary");
                    Employee e = new Employee(id, name, age, salary);
                    result.add(e);
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

    public static int insertSupplier(String id, String name, int age, int salary) throws SQLException {
        Connection cn = MyConnection.makeConnection();
        int result = 0;
        if (cn != null) {
            String sql = "insert supplier values(?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setInt(3, age);
            pst.setInt(3, salary);
            result = pst.executeUpdate();
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            EmployeeServer obj = new EmployeeServer();
            LocateRegistry.createRegistry(8888);
            Runtime r = Runtime.getRuntime();
            r.exec("rmiregistry.exe");
            Naming.rebind("rmi://localhost:8888/now", obj);
            System.out.println("SEVER READY");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Vector<String> getColumnName() throws RemoteException {
        Vector<String> header = new Vector<>();
        Connection cn = null;
        try {
            cn = MyConnection.makeConnection();
            if (cn != null) {
                String sql = "Select *\n"
                        + "from employee";
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
}


