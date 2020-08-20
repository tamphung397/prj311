/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class ClientSocket {

    public static void main(String[] args) {
        System.out.println("Day la client");
        try {
            Socket socket = new Socket("localhost", 8889);
            System.out.println("Dang cho connect???");
            //luong ra
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            //luong vao
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            // nhap 2 so
            while (true) {
                System.out.println("Nhap so a:");
                dos.writeDouble(new Scanner(System.in).nextDouble());
                dos.flush();
                System.out.println("Nhap so b:");
                dos.writeDouble(new Scanner(System.in).nextDouble());
                dos.flush();
                
                
                
               double tong = dis.readDouble();
                System.out.println("Sum of client:" + tong);
            }
        } catch (IOException ex) {
            Logger.getLogger(ClientSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
