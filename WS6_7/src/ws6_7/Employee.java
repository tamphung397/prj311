/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws6_7;

/**
 *
 * @author USER
 */
public class Employee {
    String id;
    String name;
    float Money;
    float ToltalHours;

    public Employee(String id, String name, float Money, float ToltalHours) {
        this.id = id;
        this.name = name;
        this.Money = Money;
        this.ToltalHours = ToltalHours;
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

    public float getMoney() {
        return Money;
    }

    public void setMoney(float Money) {
        this.Money = Money;
    }

    public float getToltalHours() {
        return ToltalHours;
    }

    public void setToltalHours(float ToltalHours) {
        this.ToltalHours = ToltalHours;
    }

    @Override
    public String toString() {
        return id + "," + name + ","+ Money +","+ToltalHours;
    }

  
    
    
}
