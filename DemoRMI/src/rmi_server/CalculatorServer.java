/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi_server;

import java.rmi.registry.LocateRegistry;

/**
 *
 * @author USER
 */
public class CalculatorServer {
    public CalculatorServer(){
        try {
            LocateRegistry.createRegistry(1098);
            
        } catch (Exception e) {
        }
    }
}
