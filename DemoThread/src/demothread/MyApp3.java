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
public class MyApp3 {

    int balacnce;

    public MyApp3(int balacnce) {
        this.balacnce = balacnce;
    }

    public synchronized void withDraw(int money) {
        if (money > balacnce) {
            try {
                System.out.println("Thinh rut = " + money + "nhung ko du phai doi");
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        balacnce -= money;
        System.out.println("Rut thanh cong " + money + "so du con lai" + balacnce);

    }

    public synchronized void deposit(int money) {
        balacnce += money;
        System.out.println("Bo da gui them " + money + "vao tai khoan");

        try {
            notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
