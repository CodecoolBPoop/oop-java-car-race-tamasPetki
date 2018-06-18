package com.codecool;

public class Truck extends Vehicle {

    boolean breakedDown = false;
    int breakdownTurnsLeft;

    public Truck() {
        super();
        setSpeed(100);

        int truckno = randomNumber.nextInt(1000);
        setName(String.valueOf(truckno));
    }

    public boolean isBreakedDown() {
        return breakedDown;
    }

    public void setBreakedDown(boolean breakedDown) {
        this.breakedDown = breakedDown;
    }

    public int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    public void setBreakdownTurnsLeft(int breakdownTurnsLeft) {
        this.breakdownTurnsLeft = breakdownTurnsLeft;
    }

    public void moveForAnHour(Race race) {

        int chancheToBreakDown = randomNumber.nextInt(100);

        if (breakdownTurnsLeft > 0) {
            breakdownTurnsLeft--;
            return;
        }

        if (breakdownTurnsLeft == 0) {
            setBreakedDown(false);
            if (chancheToBreakDown < 5) {
                setBreakedDown(true);
                breakdownTurnsLeft = 2;
            }
        }

        setDistanceTraveled(super.getDistanceTraveled() + super.getSpeed());
    }


    /*
     Truck
     // speed: 100km/h. 5% chance of breaking down for 2 hours.
     // Truck drivers are boring. They call all their trucks a random number between 0 and 1000.

     breakdownTurnsLeft // holds how long its still broken down.
     distanceTraveled
     moveForAnHour(Race race)
     */
}
