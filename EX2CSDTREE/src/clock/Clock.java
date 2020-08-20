/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Clock {
    String ID = "";
    String manufacture = "";
    int price = 0;
    Scanner sc = new Scanner(System.in);
    public Clock(String ID) {
        this.ID = ID;
    }
     public Clock(String ID, String manufacture, int p) {
        this.ID = ID;
        this.manufacture = manufacture;
        this.price = p;
    }
     public static  Comparator comparator = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
           return ((Clock)o1).ID.compareTo(((Clock)o2).ID);
        }
    };

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return ID + ", " + manufacture + ", " + price;
    }
     

}
