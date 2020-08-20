/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc_sql;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Test_DBAAccess {
    
    public static void main(String[] args) {
    
       DBAAcess dba = new DBAAcess();
        try {
         
            System.out.println(dba.getCon());
                      dba.printData();
                      dba.getData();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test_DBAAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
