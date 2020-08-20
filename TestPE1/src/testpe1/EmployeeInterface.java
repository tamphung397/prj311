/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testpe1;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Vector;

/**
 *
 * @author USER
 */
public interface EmployeeInterface extends Remote {

    public Vector<Employee> getSupplier() throws RemoteException;

    public Vector<String> getColumnName() throws RemoteException;
}
