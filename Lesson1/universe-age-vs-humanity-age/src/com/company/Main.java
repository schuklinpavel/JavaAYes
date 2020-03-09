package com.company;

public class Main {

    public static void main(String[] args) {
        final long ageUniverse = 13_000_000_000L;
        final int ageHumanity = 100_000;
        final long universeOlderHumanityTimes = ageUniverse / ageHumanity;

        System.out.println("ageUniverse = " + ageUniverse);
        System.out.println("ageHumanity = " + ageHumanity);
        System.out.println("universeOlderHumanityTimes = " + universeOlderHumanityTimes);
    }
}
