package org.example;

public class Main {
    public static void main(String[] args) {
        final int heightOfMan = 187;
        final int wightOfMan = 90;

        final double minPerfectWeight = (heightOfMan - 100) * 0.9 - 5;
        final double maxPerfectWeight = (heightOfMan - 100) * 0.9 + 5;

        System.out.println("\nheightOfMan = " + heightOfMan);
        System.out.println("wightOfMan = " + wightOfMan);

        System.out.println("\nminPerfectWeight = " + minPerfectWeight);
        System.out.println("maxPerfectWeight = " + maxPerfectWeight);

        if (minPerfectWeight <= wightOfMan && wightOfMan <= maxPerfectWeight) {
            System.out.println("\nit's a perfect weight");
        } else {
            System.out.println("\nit's not a perfect weight");
        }
    }
}
