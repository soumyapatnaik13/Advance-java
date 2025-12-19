package org.example;

public class Person {

    private String name;
    private Vehicle vehicle;   // dependency

    public Person() {
        System.out.println("org.example.Person constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Spring will inject this
    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + " and this is my vehicle:");
        vehicle.drive();
    }
}
