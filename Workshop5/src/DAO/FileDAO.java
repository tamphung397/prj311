/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import SmartPhone.Brand;
import SmartPhone.SmartPhone;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author USER
 */
public class FileDAO {

    public static HashMap<Brand, ArrayList<SmartPhone>> loadSmartFromFile(String filename) {
        HashMap<Brand, ArrayList<SmartPhone>> hashMap = new HashMap<Brand, ArrayList<SmartPhone>>();
        FileReader f = null;
        BufferedReader bf = null;
        try {
            f = new FileReader(filename);
            bf = new BufferedReader(f);
            Brand keyBrand = null;
            while (bf.ready()) {
                String s = bf.readLine();
                s = s.trim();
               
                if (s.contains(":")) {
                    keyBrand = new Brand(s.substring(0, s.length() - 1));
                    hashMap.put(keyBrand, new ArrayList<SmartPhone>());
//                    System.out.println(keyBrand);
                } else {
                    String[] r = s.split("-");
                    hashMap.get(keyBrand).add(new SmartPhone(r[0], r[1], r[2], Integer.parseInt(r[3])));
//                    System.out.println(s);
                   
                }
                
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (f != null) {
                    f.close();
                }
                if (bf != null) {
                    bf.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        System.out.println(hashMap);
        return hashMap;

    }

 
}
