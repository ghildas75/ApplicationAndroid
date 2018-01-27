package com.example.portable.realmadrid;

import java.io.Serializable;

/**
 * Created by Portable on 2017-11-09.
 */

public class Login implements Serializable {
    private String lastname;
    private String firstname;
    private String type;
    private String username;
    private String pswd;

    public Login() {
    }

    public Login(String lastname, String firstname, String type, String username, String pswd) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.type = type;
        this.username = username;
        this.pswd = pswd;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    @Override
    public boolean equals(Object user) {
        return (this.username.equalsIgnoreCase(((Login) user).getUsername()) && this.pswd .equals(((Login) user).getPswd()));
    }
}
