/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SmartPhone;

/**
 *
 * @author USER
 */
public class SmartPhone {
    private String id;
    private String name;
    private String made;
    private int price;

    public SmartPhone() {
    }
    
    public SmartPhone (String id, String name){
         this.id = id;
        this.name = name;
    }
    public SmartPhone(String id, String name, String made, int price) {
        this.id = id;
        this.name = name;
      
        this.made = made;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " - " + name ;
    }
    
    public void printSmart(){
        System.out.println(id + " - " + name + " - " +made + " - " + price);
    }
    
}
