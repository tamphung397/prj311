/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task;

/**
 *
 * @author USER
 */
public class ThrdProp_1 extends Thread {

    public ThrdProp_1(String thrdName) {
        super(thrdName);
        this.start();
    }

    public static void showProp(Thread t) {
        System.out.println("Thread ID:" + t.getId());
        System.out.println("I am the" + t.getName() + " thread");
        System.out.println("Thread Priority:" + t.getPriority());
        System.out.println("Thread State:" + t.getState());
        System.out.println("I am alive:" + t.isAlive());
        System.out.println("I am daemon:" + t.isDaemon());
    }

    @Override
    public void run() {
        showProp(this);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ThrdProp_1 t1 = new ThrdProp_1("1st Child");
        ThrdProp_1 t2 = new ThrdProp_1("2st Child");
      
    }

}
