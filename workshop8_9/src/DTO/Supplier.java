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
public class Supplier {

    private String id;
    private String name;

    public Supplier(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public Supplier(String id){
         this.id = id;
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

    @Override
    public String toString() {
        return "Supplier{" + "id=" + id + ", name=" + name + '}';
    }
}
