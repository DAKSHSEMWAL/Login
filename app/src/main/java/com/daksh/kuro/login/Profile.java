package com.daksh.kuro.login;

import com.google.gson.annotations.SerializedName;

public class Profile {

    private int id;
    private String email;
    private String phone;
    private String dob;
    private String gender;
    private String password;



    @SerializedName("name")
    private String name;

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public String getPhone() {
        return phone;
    }
}
