package com.codecool;

/*
Your taks will be to simulate a race. You will need to create 10 cars, 10 trucks, 10 motorcycles, and race them for 50 hours. After simulating the race print the results.
 */

public class Race {

    /*
    createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles.
    simulateRace() // simulates the race by
    // - calling moveForAnHour() on every vehicle 50 times
    // - setting whether its raining
    printRaceResults() // prints each vehicle's name, distance traveled ant type.
    boolean isThereABrokenTruck() //

    */

    public static void main(String[] args) {
        Weather.setRaining();

        Car auto = new Car();
        System.out.println("Car name:" + auto.getName() + "\t SPEED:" + auto.getSpeed() + "\t Vehicles no.: " + Vehicle.noOfVehicles);


        Car auto2 = new Car();
        System.out.println("Car name:" + auto2.getName() + "\t SPEED:" + auto2.getSpeed() + "\t Vehicles no.: " + Vehicle.noOfVehicles);
        System.out.println(Weather.isRaining);
    }
}
