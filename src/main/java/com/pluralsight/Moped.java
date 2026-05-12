package com.pluralsight;

//added vehicle extended to child class
public class Moped extends Vehicle{

    //add constructor from extended vehicle
    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }
}
