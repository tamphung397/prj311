/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamepuzzle;

import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class maiFrame extends JFrame{
    DemoLayoutt mp;

    public maiFrame() {
        mp = new DemoLayoutt();
        this.setContentPane(mp);
        setLocationRelativeTo(null);
        this.setSize(500,500);
        this.setTitle("hoc lay out");
    }
    public static void main(String[] args) {
       maiFrame f = new maiFrame();
       f.setVisible(true);
    }
    
}
