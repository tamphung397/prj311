/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class FileDAO {

    public static ArrayList<Employee> readFile(String filename) {
        ArrayList<Employee> list = new ArrayList<>();
        FileReader f = null;
        BufferedReader r = null;
        try {
            f = new FileReader(filename);
            r = new BufferedReader(f);
            while (r.ready()) {
                String s = r.readLine();
                String arr[] = s.split(";");
                if (arr.length == 5) {
                    Employee b = new Employee(arr[0], arr[1], arr[2],arr[3] ,Integer.parseInt(arr[4]));
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

    public static void writeFile(String filename, ArrayList<Employee> list) {
        PrintWriter w = null;
        if (list == null) {
            return;
        }
        try {
            w = new PrintWriter(filename);
            for (Employee st : list) {
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
