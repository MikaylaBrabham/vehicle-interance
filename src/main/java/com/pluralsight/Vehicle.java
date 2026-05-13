package com.pluralsight;

public class Vehicle {

    protected String color;
    protected int numberOfPassengers;
    protected int cargoCapacity;
    protected int fuelCapacity;
    // my personal variables to for my theme of heist
    protected boolean isWorking;
    protected boolean isElectric;
    protected boolean isTrackable;
    protected boolean isHotwireable;
    protected int stealthRating;
    protected int fuelEfficiency;



    //add constructors & other constructors for my theme
    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean isWorking,
                   boolean isElectric, boolean isTrackable, boolean isHotwireable, int stealthRating, int fuelEfficiency) {
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.isWorking = isWorking;
        this.isElectric = isElectric;
        this.isTrackable = isTrackable;
        this.isHotwireable = isHotwireable;
        this.stealthRating = stealthRating;
        this.fuelEfficiency = fuelEfficiency;
    }

    // getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    //add my getters
    public boolean isWorking() {
        return isWorking;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public boolean isTrackable() {
        return isTrackable;
    }

    public boolean isHotwireable() {
        return isHotwireable;
    }

    public int getStealthRating() {
        return stealthRating;
    }

    public int getFuelEfficiency() {
        return fuelEfficiency;
    }

    // add a method for tracking
    public void disableTracking() {
        if (isTrackable) {
            isTrackable = false;
            System.out.println("Tracking Disable");
        } else {
            System.out.println("Cannot Be Traced");
        }
    }
}




