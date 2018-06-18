package com.codecool;

import java.util.Random;

public class Weather {

    static int chanceIs30;

    static boolean isRaining;

    static void setRaining() {
        Random chanceRandom = new Random();
        chanceIs30 = chanceRandom.nextInt(100);

        if(chanceIs30<30) {
            isRaining = true;
            System.out.println("\u001B[34mIt started to rain...\u001B[0m");
        } else {
            isRaining = false;
        }

    }

    /*
    static setRaining() // 30% chance of rain.
    static boolean isRaining() // is it raining currently.
    */
}
