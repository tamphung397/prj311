/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class FileDAO {

    public static ArrayList<Book> readFile(String filename) {
        ArrayList<Book> list = new ArrayList<>();
        FileReader f = null;
        BufferedReader r = null;
        try {
            f = new FileReader(filename);
            r = new BufferedReader(f);
            while (r.ready()) {
                String s = r.readLine();
                String arr[] = s.split("-");
                if (arr.length == 6) {
                    Book b = new Book(arr[0], arr[1], arr[2], arr[3], Integer.parseInt(arr[4]), Boolean.parseBoolean(arr[5]));
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


    // ham nay de ghi mang book vao file
    public static void writeFile(String filename, ArrayList<Book> list) {
        PrintWriter w = null;
        if (list == null || list.size() == 0) {
            return;
        }
        try {
            w = new PrintWriter(filename);
            for (Book book : list) {
                String s = book.toString();
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
