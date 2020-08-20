/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 *
 * @author USER
 */
public class clockMange {
    public static void main(String[] args) {
        ClockList list = new ClockList();
        list.add(new Clock("C009", "Nam HN", 120));
        list.add(new Clock("C003", "DN", 60));
        list.add(new Clock("C005", "SG", 100));
        list.add(new Clock("C006", "QN", 200));
        list.add(new Clock("C007", "TG", 70));
        
        list.output();
             String ID ="C033";
       Clock st = list.search(ID);
        if(st == null || !st.getID().equals(ID) )
            System.out.println("Clock " + ID + " does not exist");
        else
            System.out.println("Found " + st);
        ID = "C006";
        st = list.search(ID);
        if(st == null || !st.getID().equals(ID)){
             System.out.println("Clock " + ID + "does not exist");
        }else{
            System.out.println("Found " + st);
        }
    }
}
