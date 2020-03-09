package com.company;

public class Main {

    public static void main(String[] args) {
        final int distanceHomeOffice = 12;
        final float averageSpeedTaxi = 59.9F;
        final float timeTesterGetsWorkFromHomeByTaxi = distanceHomeOffice / averageSpeedTaxi;
        final float decelerationNightSlowingSpeed = 1.45F;
        final float timeTesterGetsHomeFromWorkByTaxiNight = timeTesterGetsWorkFromHomeByTaxi * decelerationNightSlowingSpeed;

        System.out.println("distanceHomeOffice = " + distanceHomeOffice);
        System.out.println("averageSpeedTaxi = " + averageSpeedTaxi);
        System.out.println("timeTesterGetsWorkFromHomeByTaxi = " + timeTesterGetsWorkFromHomeByTaxi);
        System.out.println("decelerationNightSlowingSpeed = " + decelerationNightSlowingSpeed);
        System.out.println("timeTesterGetsHomeFromWorkByTaxiNight = " + timeTesterGetsHomeFromWorkByTaxiNight);
    }
}
