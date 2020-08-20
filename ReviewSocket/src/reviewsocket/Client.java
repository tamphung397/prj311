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
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Client {

   public void connect(){
       try {
           Socket s = new Socket("localhost", 1985);
           //Sending to server
           PrintStream ps = new PrintStream(s.getOutputStream());
           ps.println("Student");
             BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String response = bf.readLine();
          if(response!=null){
                System.out.println("Server answerd" + response);
          }
       } catch (IOException ex) {
           Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }
    public static void main(String[] args) {
      Client c = new Client();
      c.connect();
    }
    
}
