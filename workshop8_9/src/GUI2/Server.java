/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI2;

import DAO.SupplierDAO;
import DTO.Supplier;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author USER
 */
public class Server {
    public static void main(String[] args) throws IOException {
        //        // docket and server socket that appcept socket
        ServerSocket ss = new ServerSocket(1234);
        Socket skt = ss.accept();
        String in;
        String out = null;
        // pick up the score sent from client
        Scanner sc = new Scanner(skt.getInputStream());
        in = sc.nextLine();
          //Algortim of calculation
         Vector<Supplier> list = SupplierDAO.getfullSupplierId();
         for (Supplier supplier : list) {
            if(in.equalsIgnoreCase(supplier.getId())){
                out  = "Valid id";
                break;
            }
            else{
                 out  = "InValid id";
            }
        }
         System.out.println(list);
        
//        if(in < 0 || in > 100){
//            out  = "Invalid Score";
//            
//        }else if(in > 40){
//            out = "Pass";
//        }else{
//            out = "Not Pass";
//        }
        
        PrintStream ps = new PrintStream(skt.getOutputStream());
        ps.println(out);
        
      // Pick up the output sent from server
      Scanner inScan = new Scanner(skt.getInputStream());
      out = inScan.nextLine();
//      
//      // Print the out
//        System.out.println("Status:" + out);
       
    }
}
