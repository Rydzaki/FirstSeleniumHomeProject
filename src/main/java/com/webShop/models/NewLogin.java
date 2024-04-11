package com.webShop.models;

public class NewLogin {

    private String name;
    private String lastname;
    private String email;
    private String password;
    private String confirmPassword;

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public NewLogin setName(String name) {
        this.name = name;
        return this;
    }

    public NewLogin setLastname(String lastname) {
        this.lastname = lastname;
        return this;
    }

    public NewLogin setEmail(String email) {
        this.email = email;
        return this;
    }

    public NewLogin setPassword(String password) {
        this.password = password;
        return this;
    }

    public NewLogin setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    @Override
    public String toString() {
        return "NewLogin{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
