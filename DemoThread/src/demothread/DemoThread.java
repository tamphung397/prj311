/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DemoThread {

    MyThread1 t1; // t1 la thread thu nhat
    MyThread2 t2;// t2 la thread thu haiF
//    MyThread3 t3; // t1 la thread thu nhat
//    MyThread4 t4;// t2 la thread thu haiF
    
    public DemoThread() {
        t1 = new MyThread1();// tao thread
        t2 = new MyThread2();
        t1.start();// lenh nay cho lap lich t1 run'

        t2.start();// lenh nay cho lap lich t2 run
//        t3 = new MyThread3();
//        System.out.println("state cua t3: " + t3.getState());
//
//        t4 = new MyThread4();
//        System.out.println("state cua t4: " + t4.getState());
//        t3.start();
//        t4.start();
    }
//
//    class MyThread3 extends Thread {
//
//        @Override
//        public void run() {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("state cua t3 trong ham run:"+ Thread.currentThread().getState());
//            while (true) {
//                Random num = new Random();
//                System.out.println(100 + num.nextInt(900));
//                try {
//                    Thread.sleep(2000);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//    }
//
//    class MyThread4 extends Thread {
//
//        @Override
//        public void run() {
//            System.out.println(Thread.currentThread().getName());
//              System.out.println("state cua t4 trong ham run:"+ Thread.currentThread().getState());
//            for (int i = 10; i >= 0; i--) {
//                System.out.println(i);
//                try {
//                    Thread.sleep(1000);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }
//    }

    class MyThread1 extends Thread {

        String msg = "em yeu co";// day la data cua thread so 1

        @Override
        public void run() {
            while (true) {
                System.out.println(msg);
                try {
                    Thread.sleep(1000); // ham nay de tam dung 5s Thread so 1
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    class MyThread2 extends Thread {

        Date d; // day la data cua thread so 2

        @Override
        public void run() {
            while (true) {
                d = new Date();
                System.out.println(d);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DemoThread obj = new DemoThread();

    }

}
