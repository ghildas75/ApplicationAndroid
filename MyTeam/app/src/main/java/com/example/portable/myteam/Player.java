package com.example.portable.myteam;

import java.io.Serializable;
import java.lang.reflect.Constructor;

/**
 * Created by Portable on 2017-11-08.
 */

public class Player implements Serializable{
    private  String name;
    private  String  place;
    private  int age;
    private  int image;


    public Player() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Player(String name, String place, int age, int image) {
        this.name = name;
        this.place = place;
        this.age = age;

        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public int getAge() {
        return age;
    }

    public int getImage() {
        return image;
    }
}
