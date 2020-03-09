package com.company;

public class Main {

    public static void main(String[] args) {
        final double priceApartment = 2_500_000;
        final float percentInitialPaymentMortgage = 15.7F;
        final double amountInitialPaymentMortgage = priceApartment / 100 * percentInitialPaymentMortgage;

        System.out.println("priceApartment = " + priceApartment);
        System.out.println("percentInitialPaymentMortgage = " + percentInitialPaymentMortgage);
        System.out.println("amountInitialPaymentMortgage = " + amountInitialPaymentMortgage);
    }
}
