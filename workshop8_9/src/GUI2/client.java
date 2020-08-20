/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class client {

    public static void main(String[] args) throws IOException {
        Socket skt = new Socket("192.168.157.1", 1234);
        String in;
        String out;
        // Get the user input
        System.out.println("Enter ID:");
        Scanner sc = new Scanner(System.in);

        in = sc.nextLine();

        PrintStream pst = new PrintStream(skt.getOutputStream());
        pst.println(in);
        Scanner inScan = new Scanner(skt.getInputStream());
        out = inScan.nextLine();

        // Print the out
        System.out.println("Status:" + out);
    }
}
