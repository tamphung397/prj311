/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demormi;

/**
 *
 * @author USER
 */
public class CalculatorImpl extends java.rmi.server.UnicastRemoteObject implements Calculator{

    @Override
    public long add(long a, long b) {
       return a+b;
    }

    @Override
    public long sub(long a, long b) {
       return a-b;
    }

    @Override
    public long mul(long a, long b) {
        return  a*b;
    }

    @Override
    public long div(long a, long b) {
        return a/b;
    }

  
    
}
