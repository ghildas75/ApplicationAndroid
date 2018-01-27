package com.example.portable.realmadrid;

import java.io.Serializable;

/**
 * Created by Portable on 2017-11-09.
 */

public class Player implements Serializable {

    private String fullName;
    private String dateBirth;
    private String placeBirth;
    private String height;
    private int Number;
    private int image;
    private String role;

    public Player() {
    }

    public Player(String fullName, String dateBirth, String placeBirth, String height, int number, int image, String role) {
        this.fullName = fullName;
        this.dateBirth = dateBirth;
        this.placeBirth = placeBirth;
        this.height = height;
        Number = number;
        this.image = image;
        this.role=role;
    }


    public String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getPlaceBirth() {
        return placeBirth;
    }

    public void setPlaceBirth(String placeBirth) {
        this.placeBirth = placeBirth;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
