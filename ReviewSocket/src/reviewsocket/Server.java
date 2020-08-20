/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reviewsocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Server {

    public void serve() {
        try {
         
            ServerSocket server = new ServerSocket(1985);
               System.out.println("Server is ready..");
            Socket s = server.accept();
            BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String request = bf.readLine();
            if (request != null) {
                System.out.println("Received from a client:" + request);
                // Process: select database, calculator...
                // Responseto client
                PrintStream ps = new PrintStream(s.getOutputStream());
                ps.println(request.toUpperCase());
                

            }
        } catch (IOException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        Server s= new Server();
        s.serve();
    }
}
