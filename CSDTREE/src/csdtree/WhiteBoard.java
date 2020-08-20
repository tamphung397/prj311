/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csdtree;

/**
 *
 * @author USER
 */
public class WhiteBoard implements Comparable<WhiteBoard>{
    private String Id;
    private int length;
    private int height;
    private int day;
    private double price;

    public WhiteBoard() {
    }

    public WhiteBoard(String Id, int height, int length, int day, double price) {
        this.Id = Id;
        this.length = length;
        this.height = height;
        this.day = day;
        this.price = price;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return Id + "," + height + "," + length + "," + day + "," + price;
    }

//    @Override
//    public String toString() {
//        return  "Id:" + Id + ", height: " + height + ", length:" + length + ", day:" + day + ", price:" + price ;
//    }
    

    @Override
    public int compareTo(WhiteBoard o) {
            if(Id.compareTo(o.getId())!= 0)
            return 1;
       
        return 0;
    }
    
}
