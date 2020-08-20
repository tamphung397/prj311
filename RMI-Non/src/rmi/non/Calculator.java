/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.non;

/**
 *
 * @author USER
 */
public class Calculator {
    public static void main(String[] args) {
        Math math = new Math();
        System.out.println(math.add(3, 4));
    }
}
