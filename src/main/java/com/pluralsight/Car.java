package com.pluralsight;

public class Car extends Vehicle{
    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean isWorking,
               boolean isElectric, boolean isTrackable, boolean isHotwireable, int stealthRating, int fuelEfficiency) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity, isWorking, isElectric, isTrackable, isHotwireable, stealthRating, fuelEfficiency);
    }
}
