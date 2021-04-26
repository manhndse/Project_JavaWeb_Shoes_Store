/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author MacBook
 */
public class Product {

    private String id;
    private String name;
    private String unit;
    private double price;
    private String image;
    private int view;

    public Product() {
    }

    public Product(String id, String name, String unit, double price, String image) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.image = image;
    }

    public Product(String id, String name, String unit, double price, String image, int view) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.price = price;
        this.image = image;
        this.view = view;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

}
