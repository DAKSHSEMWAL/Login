package com.daksh.kuro.login;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Post {

    private String name;
    private String email;
    private String gender;
    private String dob;
    private String phone;
    private String password;
    private String user ;

    public Post(String user) {
        this.user = user;
    }

    public Post(String name, String email, String gender, String dob, String phone, String password) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
        this.phone = phone;
        this.password = password;
    }
}