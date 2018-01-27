package com.example.portable.laboexercice4;

/**
 * Created by Portable on 2017-11-01.
 */

public class Car {
    private String model;
    private String color;
    private double prix;
    private int image;

    public Car (String model, String color, double prix, int image){
        this.model=model;
        this.color=color;
        this.prix=prix;
        this.image=image;
    }
    public String getModel() {
        return model;
    }

    public double getPrix() {
        return prix;
    }

    public String getColor() {
        return color;
    }

    public int getImage() {
        return image;
    }
}
