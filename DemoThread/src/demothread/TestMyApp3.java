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
public class TestMyApp3 {
    public static void main(String[] args) {
        MyApp3 c = new MyApp3(100);
        Thinh t1 = new Thinh(c);
        BoThinh t2 = new BoThinh(c);
        t1.start();
        t2.start();
        
    }
}
