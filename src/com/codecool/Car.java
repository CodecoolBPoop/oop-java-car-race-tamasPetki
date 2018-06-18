package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Car extends Vehicle {

    List<String> vehicleNames = new ArrayList<>(Arrays.asList("Icon","Guerilla","Specter","Behemoth", "Cosmos", "Oracle", "Vigor", "Moonlight", "Crown","Hollo"));

    public Car() {
        super();
        int randomSpeed = randomNumber.nextInt(30) + 80;
        setSpeed(randomSpeed);
        int randomIndexOfName1 = randomNumber.nextInt(10);
        int randomIndexOfName2 = randomNumber.nextInt(10);
        setName(vehicleNames.get(randomIndexOfName1) + " " + vehicleNames.get(randomIndexOfName2));
    }

    @Override
    public String toString() {
        return getName();
    }
}

/*
    Car
            normalSpeed // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
    name // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php and pick 2 randomly for each instance.
            distanceTraveled // holds the current distance traveled.
    moveForAnHour(Race race) // The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only!
// If there is a broken down Truck on the track, then limit the max speed of vehicles to 75 km/h.

*/