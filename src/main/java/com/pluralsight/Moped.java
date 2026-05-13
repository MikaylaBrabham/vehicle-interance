package com.pluralsight;

//added vehicle extended to child class
public class Moped extends Vehicle{

    //add constructor from extended vehicle

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean isWorking,
                 boolean isElectric, boolean isTrackable, boolean isHotwireable, int stealthRating, int fuelEfficiency) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, isWorking, isElectric, isTrackable, isHotwireable, stealthRating, fuelEfficiency);
    }
}

