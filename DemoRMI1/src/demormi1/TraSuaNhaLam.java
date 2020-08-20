/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormi1;

import java.io.IOException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class TraSuaNhaLam extends UnicastRemoteObject implements  Menu{

    public  TraSuaNhaLam() throws RemoteException {
       
    }

    
    
    @Override
    public int getMilkTea(int soluong) throws RemoteException {
         return soluong*50000;
    }
    public static void main(String[] args) throws IOException {
        try {
            TraSuaNhaLam obj = new TraSuaNhaLam();
            LocateRegistry.createRegistry(8888);
            Runtime r = Runtime.getRuntime();
            r.exec("rmiregistry.exe");
            // chon nick name de client goi
            
            //rang buoc ten
            Naming.rebind("rmi://localhost:8888/now", obj);
            System.out.println("started");
        } catch (RemoteException ex) {
            Logger.getLogger(TraSuaNhaLam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
