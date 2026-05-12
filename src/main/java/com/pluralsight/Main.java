package com.pluralsight;

public class Main extends Vehicle {

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
        Car easyDrive = new Car();

        //use setters
        easyDrive.setColor("Red");
        easyDrive.setNumberOfPassengers(4);
        easyDrive.setCargoCapacity(15);
        easyDrive.setFuelCapacity(12);

        //print values to verify working
        System.out.println("The Car is" + easyDrive.getColor());
        System.out.println("The Car can have " + easyDrive.getNumberOfPassengers() + " of passengers.");
        System.out.println("The Car holds " + easyDrive.getCargoCapacity() + " of items.");
        System.out.println("The Car needs " + easyDrive.getFuelCapacity() + "gallons to have a full tank.");


        //create instance for SemiTruck

        SemiTruck largestDrive = new SemiTruck();

        //use setters
        largestDrive.setColor("Purple");
        largestDrive.setNumberOfPassengers(1);
        largestDrive.setCargoCapacity(100);
        largestDrive.setFuelCapacity(300);

        //print values to verify working
        System.out.println("The SemiTruck is" + largestDrive.getColor());
        System.out.println("The SemiTruck can have " + largestDrive.getNumberOfPassengers() + " of passengers.");
        System.out.println("The SemiTruck holds " + largestDrive.getCargoCapacity() + " of items.");
        System.out.println("The SemiTruck needs " + largestDrive.getFuelCapacity() + "gallons to have a full tank.");




        //create instance for Hovercraft



        //use setters

        //print values to verify working
    }



}