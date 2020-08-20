/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author USER
 */
public class Employee implements Comparable<Employee>{

    private String ID;
    private String name;
    private String address;
    private String sex;

    private int salary;

    public Employee() {
    }

    public Employee(String ID, String name, String address, String sex, int salary) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.salary = salary;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }
    
    
    public void setSalary(int salary) {
        this.salary = salary;
    }

    

    @Override
    public String toString() {
        return ID + ";" + name + ";" + address + ";" + sex + ";" + salary;
    }

    @Override
    public int compareTo(Employee o) {
       if(ID.compareTo(o.getID()) > 0){
           return 1;
       }else if(ID.compareTo(o.getID()) < 0){
           return  -1;
       }
        return 0;
    }
    

}
