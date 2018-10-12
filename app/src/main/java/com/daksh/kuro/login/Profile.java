package com.daksh.kuro.login;

import com.google.gson.annotations.SerializedName;

public class Profile {

    private String status;
    private int id;
    private String email;
    private String phone;
    private String dob;
    private String gender;
    private String password;
    private String loyality_points;
    private String photo;

    @SerializedName("name")
    private String name;

    public String getStatus() { return status; }

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

    public String getLoyality_points() { return loyality_points; }

    public String getPhoto() { return photo; }
}
