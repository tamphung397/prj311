/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolveDeadLock;

/**
 *
 * @author USER
 */
public class TestResolveDeadlock {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        resolveDeadLock.ThreadDemo1 t1 = new resolveDeadLock.ThreadDemo1(obj1, obj2);
        t1.start();
        resolveDeadLock.ThreadDemo2 t2 = new resolveDeadLock.ThreadDemo2(obj1, obj2);
        t2.start();
    }
}
