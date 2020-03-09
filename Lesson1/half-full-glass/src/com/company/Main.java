package com.company;

public class Main {

    public static void main(String[] args) {
        final int capacityGlassMillilitres = 300;
        final double percentsGlassFull = 51.5;
        final double amountGlassMillilitres = capacityGlassMillilitres / 100 * percentsGlassFull;

        System.out.println("capacityGlassMillilitres = " + capacityGlassMillilitres);
        System.out.println("percentsGlassFull = " + percentsGlassFull);
        System.out.println("amountGlassMillilitres = " + amountGlassMillilitres);
    }
}
