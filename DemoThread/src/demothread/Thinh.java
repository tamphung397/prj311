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
public class Thinh extends Thread{
    MyApp3 c;

    public Thinh(MyApp3 c) {
        this.c = c;
    }

    @Override
    public void run() {
       c.withDraw(2000);
    }
    
}
