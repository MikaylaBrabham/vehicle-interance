package com.pluralsight;
import java.util.Formatter;

public class Main {

    public static void main(String[] args) {

        //create instance for Moped
        Moped slowDrive = new Moped("Pink", 1, 5, 2);

        //print values to verify working
        System.out.printf("The SemiTruck\n is %s\n holds %d passengers\n holds %d items\n and takes %d gallons to be considered full\n\n",
                slowDrive.getColor(), slowDrive.getNumberOfPassengers(), slowDrive.getCargoCapacity(), slowDrive.getFuelCapacity() );

        //this is the old way i went about it for all
       // System.out.println("The Moped is " + slowDrive.getColor());
      //  System.out.println("The Moped can have " + slowDrive.getNumberOfPassengers() + " of passengers.");
        //System.out.println("The Moped holds " + slowDrive.getCargoCapacity() + " of items.");
        //System.out.println("The Moped needs " + slowDrive.getFuelCapacity() + " gallons to have a full tank.\n");



        //create instance for Car
        Car easyDrive = new Car("Red", 4, 15, 12);

        //print values to verify working
        System.out.printf("The SemiTruck\n is %s\n holds %d passengers\n holds %d items\n and takes %d gallons to be considered full\n\n",
                easyDrive.getColor(), easyDrive.getNumberOfPassengers(), easyDrive.getCargoCapacity(), easyDrive.getFuelCapacity() );



        //create instance for SemiTruck
        SemiTruck largestDrive = new SemiTruck("Purple", 1, 100, 300);

        //print values to verify working
        System.out.printf("The SemiTruck\n is %s\n holds %d passengers\n holds %d items\n and takes %d gallons to be considered full\n\n",
                largestDrive.getColor(), largestDrive.getNumberOfPassengers(), largestDrive.getCargoCapacity(), largestDrive.getFuelCapacity() );



        //create instance for Hovercraft
        Hovercraft amphiDrive = new Hovercraft("black", 3, 20, 20);

        //print values to verify working
        System.out.printf("The Hovercraft\n is %s\n holds %d passengers\n holds %d items\n and takes %d gallons to be considered full\n",
                amphiDrive.getColor(), amphiDrive.getNumberOfPassengers(), amphiDrive.getCargoCapacity(), amphiDrive.getFuelCapacity() );

    }

}