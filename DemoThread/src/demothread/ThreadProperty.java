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
public class ThreadProperty extends Thread{

    public ThreadProperty(String threName) {
        super(threName);
        this.start();
    }
    public  static void showProp(Thread t){
        System.out.println("Thread ID:"+t.getId());
        System.out.println("I am the " + t.getName() + "thread");
        System.out.println("Thread Priority:" + t.getPriority());
        System.out.println("Thread State:" + t.getState());
        System.out.println("I am alive:"+t.isAlive());
        System.out.println("I am daemon:"+t.isDaemon());
    
    }
    
    @Override
    public void run() {
        showProp(this);
    }
    public static void main(String[] args) {
        ThreadProperty obj = new ThreadProperty("first child ");
     
        ThreadProperty obj2 = new ThreadProperty("second child ");
    }
    
}
