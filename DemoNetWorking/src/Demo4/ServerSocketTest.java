/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class ServerSocketTest {
    public static void main(String[] args) {
        System.out.println("Day la server");
        try {
            ServerSocket serverSocket = new ServerSocket(8889);
            Socket socket = serverSocket.accept(); // dong y ket noi
            System.out.println("Cho phep client ket noi");
            //luong ra
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            //luong vao
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            while(true){
                double so1 = dis.readDouble();
                double so2 = dis.readDouble();
                double tong = so1 + so2;
                System.out.println("Sum of server :" + tong);
                dos.writeDouble(tong); // day ve client
                dos.flush();

            }
        } catch (IOException ex) {
            Logger.getLogger(ServerSocketTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
