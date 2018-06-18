package com.codecool;

import java.util.Random;

public class Motorcycle extends Vehicle {

    static int nameNumber;

    public Motorcycle() {
        setName("Motorcycle " + String.valueOf(nameNumber++));
        setSpeed(100);
    }

    void moveForAnHour(Race race) {
        if(Weather.isRaining) {
            int speedModifier = randomNumber.nextInt(45)+5;
            setSpeed(getSpeed()-speedModifier);
        } else {
            setSpeed(100);
        }

        setDistanceTraveled(getDistanceTraveled() + getSpeed());
    }

    /*
    Motorcycle // speed is 100km/h. If it rains, travels with 5-50km/h slower (randomly).
    static nameNumber // The number of the instance created. Used for its name.
            name // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
    distanceTraveled
    moveForAnHour(Race race)
    */

}
