/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormi1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author USER
 */
public interface Menu extends Remote{
    public int getMilkTea(int soluong) throws RemoteException;
    
        
    
}
