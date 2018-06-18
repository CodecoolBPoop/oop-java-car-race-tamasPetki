package com.codecool;

/*
Your taks will be to simulate a race. You will need to create 10 cars, 10 trucks, 10 motorcycles, and race them for 50 hours. After simulating the race print the results.
 */

import java.util.ArrayList;
import java.util.List;

public class Race {
    List<Car> cars = new ArrayList<>();
    List<Truck> trucks = new ArrayList<>();
    List<Motorcycle> motorcycles = new ArrayList<>();

    int timeTillBrokenTruck;
    private boolean isThereABrokenTruck = false;

    public boolean isThereABrokenTruck() {
        return isThereABrokenTruck;
    }


    public void setIsThereABrokenTruck(boolean thereABrokenTruck) {
        isThereABrokenTruck = thereABrokenTruck;
    }


    public void createVehicles() {
        for (int i = 1; i < 11; i++) {
            cars.add(new Car());
        }

        for (int i = 1; i < 11; i++) {
            trucks.add(new Truck());
        }


        for (int i = 1; i < 11; i++) {
            motorcycles.add(new Motorcycle());
        }
    }

    public void simulateRace(Race race) {
        for (int round = 0; round < 50; round++) {

            System.out.println("\n" + round + " hour(s)\n-------------------");

            for (int i = 0; i < 10; i++) {

                cars.get(i).moveForAnHour(race);
                System.out.println("Racecar with " + cars.get(i).getName() + "\n\tdrived " + cars.get(i).getDistanceTraveled() + " kms and his current speed is " + cars.get(i).getSpeed());

                trucks.get(i).moveForAnHour(race);
                System.out.println("Truck no. " + trucks.get(i).getName() + "\n\tdrived " + trucks.get(i).getDistanceTraveled() + " kms and his current speed is " + trucks.get(i).getSpeed());

                if (trucks.get(i).getBreakdownTurnsLeft() > 0 && trucks.get(i).getBreakdownTurnsLeft() >= timeTillBrokenTruck) {
                    timeTillBrokenTruck = trucks.get(i).getBreakdownTurnsLeft();
                    System.out.println("\u001B[31mNo. " + trucks.get(i).getName() + " truck is breaked down...\u001B[0m");
                }
                motorcycles.get(i).moveForAnHour(race);
                System.out.println("Motorcycle / " + motorcycles.get(i).getName() + "\n\tdrived " + motorcycles.get(i).getDistanceTraveled() + " kms and his current speed is " + motorcycles.get(i).getSpeed());

                System.out.println();
            }

            Weather.setRaining();

        }
    }

    public void printRaceResults() {

        for (Car thisCar : cars) {

            System.out.println(thisCar.getName() + "\n\tDistance: " + thisCar.getDistanceTraveled() + "\n--------------------");
        }

        for (Truck thisTruck : trucks) {
            System.out.println("Truck no. " + thisTruck.getName() + "\n\tDistance: " + thisTruck.getDistanceTraveled() + "\n--------------------");
        }

        for (Motorcycle thisMotorcycle : motorcycles) {
            System.out.println(thisMotorcycle.getName() + "\n\tDistance: " + thisMotorcycle.getDistanceTraveled() + "\n--------------------");
        }
    }

    /*
    createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles.
    simulateRace() // simulates the race by
    // - calling moveForAnHour() on every vehicle 50 times
    // - setting whether its raining
    printRaceResults() // prints each vehicle's name, distance traveled ant type.
    boolean isThereABrokenTruck() //

    */

    public static void main(String[] args) {
        Race bigRace = new Race();

        bigRace.createVehicles();
        bigRace.simulateRace(bigRace);
        bigRace.printRaceResults();

    }
}
