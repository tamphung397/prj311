/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassFail;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ClinentPF {

    public static void main(String[] args) throws IOException {
        // Create a socket to connect to server
        Socket skt = new Socket("192.168.130.61", 1234);
        int in;
        String out;
        // Get the user input
        System.out.println("Enter Score:");
        Scanner sc = new Scanner(System.in);

        in = sc.nextInt();

        PrintStream pst = new PrintStream(skt.getOutputStream());
        pst.println(in);
        Scanner inScan = new Scanner(skt.getInputStream());
        out = inScan.nextLine();

        // Print the out
        System.out.println("Status:" + out);

    }
}
