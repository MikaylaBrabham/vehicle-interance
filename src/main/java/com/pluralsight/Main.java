package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        //create instance for Moped
        Moped slowDrive = new Moped();

        //use setters
        slowDrive.setColor("Pink");
        slowDrive.setNumberOfPassengers(1);
        slowDrive.setCargoCapacity(5);
        slowDrive.setFuelCapacity(2);

        //print values to verify working
        System.out.println("The Moped is" + slowDrive.getColor());
        System.out.println("The Moped can have " + slowDrive.getNumberOfPassengers() + " of passengers.");
        System.out.println("The Moped holds " + slowDrive.getCargoCapacity() + " of items.");
        System.out.println("The Moped needs " + slowDrive.getFuelCapacity() + "gallons to have a full tank.");



        //create instance for Car


        //use setters

        //print values to verify working



        //create instance for SemiTruck

        //use setters

        //print values to verify working



        //create instance for Hovercraft


        //use setters

        //print values to verify working
    }



}