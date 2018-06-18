package com.codecool;

/*
Your taks will be to simulate a race. You will need to create 10 cars, 10 trucks, 10 motorcycles, and race them for 50 hours. After simulating the race print the results.
 */

import java.util.ArrayList;
import java.util.List;

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
        List<Object> cars = new ArrayList<>();

        Weather.setRaining();

        for(int i=1; i<11; i++) {
        cars.add(new Car());
        }

        for(Object car: cars) {
            System.out.println("Car name: " + car);
        }

        System.out.println("Number of vehicles: " + Vehicle.noOfVehicles);


        System.out.println("Is it raining?: " + Weather.isRaining);
    }
}
