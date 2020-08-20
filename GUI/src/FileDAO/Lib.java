/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileDAO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author USER
 */
public class Lib {
    public static Vector<String> readFile(String filename){
        FileReader f = null;
        BufferedReader r = null;
        Vector<String> list = new Vector<>();
        try {
            f = new FileReader(filename);
            r = new BufferedReader(f);
            while(r.ready()){
                String s = r.readLine(); // doc tung dong trong buffer ra
                list.add(s);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(f!=null) f.close();
                if(r!=null) f.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }
}
