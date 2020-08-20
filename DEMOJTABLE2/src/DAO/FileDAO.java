/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Stock;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class FileDAO {

    public static ArrayList<Stock> readFile(String filename) {

        File file = new File(filename);

        if (!file.exists()) {

            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(FileDAO.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        ArrayList<Stock> list = new ArrayList<>();
        FileReader f = null;
        BufferedReader r = null;
        try {
            f = new FileReader(filename);
            r = new BufferedReader(f);
            while (r.ready()) {
                String s = r.readLine();
                String arr[] = s.split(";");
                if (arr.length == 4) {
                    Stock b = new Stock(arr[0], arr[1], arr[2], arr[3]);
                    System.out.println(b);
                    list.add(b);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (f != null) {
                    f.close();
                }
                if (r != null) {
                    r.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;

    }

    public static void writeFile(String filename, ArrayList<Stock> list) {
        PrintWriter w = null;
        if (list == null || list.size() == 0) {
            return;
        }
        try {
            w = new PrintWriter(filename);
            for (Stock st : list) {
                String s = st.toString();
                w.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (w != null) {
                    w.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
