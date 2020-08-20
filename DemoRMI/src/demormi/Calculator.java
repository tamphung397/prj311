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
public interface Calculator extends java.rmi.Remote{
    public long add(long a, long b);
      public long sub(long a, long b);
        public long mul(long a, long b);  
      public long div(long a, long b);
}
