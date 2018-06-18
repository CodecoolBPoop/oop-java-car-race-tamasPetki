package com.codecool;

import java.util.Random;

class Vehicle {

    private int speed;
    private String name;
    private int distanceTraveled;
    static int noOfVehicles = 0;

    Random randomNumber = new Random();

    Vehicle() {
        this("Noname");
    }

    Vehicle(String name) {
        this.name = name;
        noOfVehicles++;
    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }


    int getDistanceTraveled() {
        return distanceTraveled;
    }

    void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }


    void MoveForAnHour() {
        setDistanceTraveled(distanceTraveled + speed);
    }






    /*
 Motorcycle // speed is 100km/h. If it rains, travels with 5-50km/h slower (randomly).
 static nameNumber // The number of the instance created. Used for its name.
 name // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
 distanceTraveled
 moveForAnHour(Race race)

Truck // speed: 100km/h. 5% chance of breaking down for 2 hours.
 // Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
 breakdownTurnsLeft // holds how long its still broken down.
 distanceTraveled
 moveForAnHour(Race race)
     */

}
