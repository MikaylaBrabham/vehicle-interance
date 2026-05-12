package com.pluralsight;

public class Main {

    public static void main(String[] args) {

        //create instance for Moped
        Moped slowDrive = new Moped("Pink", 1, 5, 2);


        //print values to verify working
        System.out.println("The Moped is " + slowDrive.getColor());
        System.out.println("The Moped can have " + slowDrive.getNumberOfPassengers() + " of passengers.");
        System.out.println("The Moped holds " + slowDrive.getCargoCapacity() + " of items.");
        System.out.println("The Moped needs " + slowDrive.getFuelCapacity() + " gallons to have a full tank.\n");



        //create instance for Car
        Car easyDrive = new Car("Red", 4, 15, 12);


        //print values to verify working
        System.out.println("The Car is " + easyDrive.getColor());
        System.out.println("The Car can have " + easyDrive.getNumberOfPassengers() + " of passengers.");
        System.out.println("The Car holds " + easyDrive.getCargoCapacity() + " of items.");
        System.out.println("The Car needs " + easyDrive.getFuelCapacity() + " gallons to have a full tank.\n");


        //create instance for SemiTruck

        SemiTruck largestDrive = new SemiTruck("Purple", 1, 100, 300);


        //print values to verify working
        System.out.println("The SemiTruck is " + largestDrive.getColor());
        System.out.println("The SemiTruck can have " + largestDrive.getNumberOfPassengers() + " of passengers.");
        System.out.println("The SemiTruck holds " + largestDrive.getCargoCapacity() + " of items.");
        System.out.println("The SemiTruck needs " + largestDrive.getFuelCapacity() + " gallons to have a full tank.\n");



        //create instance for Hovercraft
        Hovercraft amphiDrive = new Hovercraft("black", 3, 20, 20);


        //print values to verify working
        System.out.println("The Hovercraft is " + amphiDrive.getColor());
        System.out.println("The Hovercraft can have " + amphiDrive.getNumberOfPassengers() + " of passengers.");
        System.out.println("The Hovercraft holds " + amphiDrive.getCargoCapacity() + " of items.");
        System.out.println("The Hovercraft needs " + amphiDrive.getFuelCapacity() + " gallons to have a full tank.\n");


    }

}