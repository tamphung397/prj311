/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoDeadlock;

/**
 *
 * @author USER
 */
public class TestDeadlock {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        ThreadDemo1 t1 = new ThreadDemo1(obj1, obj2);
        t1.start();

        ThreadDemo2 t2 = new ThreadDemo2(obj1, obj2);
        t2.start();
    }

}
