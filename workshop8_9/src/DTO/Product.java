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
public class Product {

    String id;
    String name;
    int price;
    String supplier;
    String idSupplier;

   

    public Product(String id, String name, int price, String idSupplier) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.idSupplier = idSupplier;
    }

    public Product(String supplier) {
        this.supplier = supplier;
    }

    public Product(String idSupplier, String supplier) {

        this.idSupplier = idSupplier;
        this.supplier = supplier;
    }

    public Product(String id, String name, int price, String supplier, String idSupplier) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.supplier = supplier;
        this.idSupplier = idSupplier;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    @Override
    public String toString() {
        return idSupplier + supplier;
    }

}
