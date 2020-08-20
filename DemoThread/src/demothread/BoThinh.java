/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread;

/**
 *
 * @author USER
 */
public class BoThinh extends Thread{
    MyApp3 c;

    public BoThinh(MyApp3 c) {
        this.c = c;
    }

    @Override
    public void run() {
       c.deposit(3000);
    }
    
    
}
