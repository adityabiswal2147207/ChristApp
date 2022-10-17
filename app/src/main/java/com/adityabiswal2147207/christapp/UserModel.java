package com.adityabiswal2147207.christapp;

public class UserModel {
    private String name,email,register_number,password;

    public UserModel() {
    }

    public UserModel(String name, String email, String register_number, String password) {
        this.name = name;
        this.email = email;
        this.register_number = register_number;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegister_number() {
        return register_number;
    }

    public void setRegister_number(String register_number) {
        this.register_number = register_number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
