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
public class ThreadDemo2 extends Thread {

    private Object obj1;
    private Object obj2;

    public ThreadDemo2(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        synchronized (obj2) {
            try {
                System.out.println("Acquire lock on object2, watting  for object 1");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj1) {
                System.out.println("Acquire lock on object 1 & object 2");
            }
        }

    }
}
