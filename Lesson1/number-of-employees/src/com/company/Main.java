package com.company;

public class Main {

    public static void main(String[] args) {
        final int amountProgrammers = 15;
        final int valueTestersPerProgrammer = 2;
        final int valueSupportsPerProgrammer = 3;
        final int amountTesters = amountProgrammers * valueTestersPerProgrammer;
        final int amountSupports = amountProgrammers * valueSupportsPerProgrammer;
        final int amountTechnicalSpecialists = amountProgrammers + amountTesters + amountSupports;

        System.out.println("amountProgrammers = " + amountProgrammers);
        System.out.println("valueTestersPerProgrammer = " + valueTestersPerProgrammer);
        System.out.println("valueSupportsPerProgrammer = " + valueSupportsPerProgrammer);
        System.out.println("amountTesters = " + amountTesters);
        System.out.println("amountSupports = " + amountSupports);
        System.out.println("amountTechnicalSpecialists = " + amountTechnicalSpecialists);
    }
}
