package org.example;

public class Vehicle {

    private String name;

    public Vehicle() {
        System.out.println("org.example.Vehicle constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drive() {
        System.out.println("Driving my " + name);
    }
}
