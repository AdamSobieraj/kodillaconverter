package com.example.kodillaconverter.domain;

public class User {
    // Attributes
    private String name;
    private String age;
    private String email;

    // Constructor
    public User(String name, String age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
