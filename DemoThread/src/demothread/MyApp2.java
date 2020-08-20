/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demothread;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author USER
 */
public class MyApp2 {

    // khai bao 2 Thread
    Thread t1;
    Thread t2;
    int count = 10;
    ArrayList list ;
    public MyApp2() {
        list = new ArrayList();
//        list.add(new Thread);
        // tao thread so 1
        t1 = new Thread(new Runnable() {
            @Override
            public void run() {
//                while (true) {
//                    System.out.println("Em se pass mon nay");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }

                while (count > -1) {
                    Random num = new Random();
                    System.out.println(100 + num.nextInt(900));
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        t2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                while (true) {
//                    System.out.println(new Date());
//                    try {
//                        Thread.sleep(1000);
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//                }

                while (count > -1) {

                    System.out.println(count);
                    count--;
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();

                    }
                }
            }
        });

        // lap livh
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        MyApp2 x = new MyApp2();
    }
}
