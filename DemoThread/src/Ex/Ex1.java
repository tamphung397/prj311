/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author USER
 */
public class Ex1 {

  
    myThread1 t1;
    myThread2 t2;
    myThread3 t3;
    myThread4 t4;
    myThread5 t5;
    
    public Ex1() {
       
        t1 = new myThread1();
        t2 = new myThread2();
        t3 = new myThread3();
        t4 = new myThread4();
        t5 = new myThread5();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
//        
    }

    class myThread1 extends Thread {

        @Override
        public void run() {
            Calendar cal;

            while (true) {
                cal = Calendar.getInstance();
                cal.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
                System.out.println("Korea:" + cal.get(Calendar.HOUR_OF_DAY) + ":"
                        + cal.get(Calendar.MINUTE) + ":"
                        + cal.get(Calendar.SECOND));
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }

    }

    class myThread2 extends Thread {

        @Override
        public void run() {
            Calendar cal;

            while (true) {
                cal = Calendar.getInstance();
                cal.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
                System.out.println("Paris:" + cal.get(Calendar.HOUR_OF_DAY) + ":"
                        + cal.get(Calendar.MINUTE) + ":"
                        + cal.get(Calendar.SECOND));
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

    class myThread3 extends Thread {

        @Override
        public void run() {
            while (true) {
                SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                Date date = new Date();
                System.out.println("Viet Nam:" + formatter.format(date));
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }

    class myThread4 extends Thread {

        @Override
        public void run() {
            Calendar cal;

            while (true) {
                cal = Calendar.getInstance();
                cal.setTimeZone(TimeZone.getTimeZone("Asia/Hong_Kong"));
                System.out.println("China:" + cal.get(Calendar.HOUR_OF_DAY) + ":"
                        + cal.get(Calendar.MINUTE) + ":"
                        + cal.get(Calendar.SECOND));
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

    class myThread5 extends Thread {

        @Override
        public void run() {
            Calendar cal;

            while (true) {
                cal = Calendar.getInstance();
                cal.setTimeZone(TimeZone.getTimeZone("Canada/Central"));
                System.out.println("Canada:" + cal.get(Calendar.HOUR_OF_DAY) + ":"
                        + cal.get(Calendar.MINUTE) + ":"
                        + cal.get(Calendar.SECOND));
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) {
        Ex1 obj = new Ex1();
        

    }
}
