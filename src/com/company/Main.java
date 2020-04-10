/*
 * Created by: Maria Temu
 * Created on: 22-March-2020
 * Created for: ICS4U
 * Day #1 (Vehicle Class)
 * I created a program that has a Vehicle class that has
 * 5 private fields and 2 methods
 */
package com.company;

public class Main {

    //creating variables
    String licensePlate;
    String colour;
    int numDoors;
    int speed;
    int maxSpeed;


    public static void main(String[] args) {
        //print vehicle information
        System.out.println("Vehicle #1");
        Main first = new Main("MARI 123",
                "Black",
                4,
                160,
                220);
        System.out.print(first.list());

        Main second = new Main("TEMU 456",
                "White",
                2,
                100,
                140);
        System.out.println("\nVehicle #2");
        System.out.print(second.list());
    }

    Main(String licensePlate,
         String colour,
         int speed,
         int maxSpeed,
         int numDoors) {
        this.licensePlate = licensePlate;
        this.colour = colour;
        this.numDoors = numDoors;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        //System.out.println("done");
    }

    public String list() {
        //returning the list
        return String.format("License Plate no.: %s " +
                        "\nColour: %s \nNumber of doors: %d " +
                        "\nSpeed: %d \nMaximum Speed: %d\n",
                licensePlate, colour, numDoors, speed, maxSpeed);


    }

    //protected methods
    protected void Accelerate() {

    }
    protected void Brake() {

    }
}
