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
public class ClassTask2 implements Runnable {

    String name;
    Thread t;

    public ClassTask2(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread:" + t);
        t.start();

    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println(t.getName() + ":" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(t.getName() + " exiting");

    }
    
    public static void main(String[] args) {
        new ClassTask2("One");
        new ClassTask2("Two"); 
        new ClassTask2("Three");        
        try {
            Thread.sleep(6000);

        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
       System.out.println("Main thread exiting");
      
    }
}
