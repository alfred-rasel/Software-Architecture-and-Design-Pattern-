/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package onlineshopping;

/**
 *
 * @author Rasel
 */
public class Product {
    private String name;
    private double price;

    // add constructor, getters and setters
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
        this.name = "";
        this.price = 0.0;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public String toString() {
        return this.name + " " + this.price;
    }

}