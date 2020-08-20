/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import ws6_7.Employee;

/**
 *
 * @author USER
 */
public class FileDAO {

    public static ArrayList<Employee> readFile(String filename) throws IOException {
        ArrayList<Employee> list = new ArrayList<>();

        File file = new File(filename);

        if (!file.exists()) {

            file.createNewFile();

        }

        FileReader f = null;
        BufferedReader bf = null;

        try {

            f = new FileReader(filename);
            bf = new BufferedReader(f);
            while (bf.ready()) {
                String s = bf.readLine();

                String[] arr = s.split(",");
                if (arr.length == 4) {
                    Employee emp = new Employee(arr[0], arr[1], Float.parseFloat(arr[2].toString()),Float.parseFloat(arr[3].toString()));
                    list.add(emp);
                    

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
                    f.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    /*ham nay de ghi dssv vao file text*/
    public static void writeFile(String filename, ArrayList<Employee> list) {
        if (list == null) {
            return;
        }

        PrintWriter w = null;
        try {
            w = new PrintWriter(filename);
            for (Employee account : list) {
                w.println(account.toString());
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
