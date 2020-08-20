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

    int id;
    String name;
    int price;
    String supplier;
    int idSupplier;

    public Product() {
    }

    public Product(int id, String name, int price, int idSupplier) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.idSupplier = idSupplier;
    }

    public Product(String supplier) {
        this.supplier = supplier;
    }

    public Product(int idSupplier, String supplier) {

        this.idSupplier = idSupplier;
        this.supplier = supplier;
    }

    public Product(int id, String name, int price, String supplier, int idSupplier) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.supplier = supplier;
        this.idSupplier = idSupplier;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(int idSupplier) {
        this.idSupplier = idSupplier;
    }

    @Override
    public String toString() {
        return idSupplier + supplier;
    }

}
