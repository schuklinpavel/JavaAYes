package com.company;

public class Main {

    public static void main(String[] args) {
        final int priceShirt = 450;
        final int amountSelectedShirts = 3;
        final int minQuantityShirtsGetDiscount = 5;
        final int quantityShirtsNeedToGetDiscount = minQuantityShirtsGetDiscount - amountSelectedShirts;

        final int totalPriceSelectedShirts = amountSelectedShirts * priceShirt;
        final int totalPriceShirtsNeedToGetDiscount = quantityShirtsNeedToGetDiscount * priceShirt;

        final float percentDiscount = 25.5F;
        final float amountDiscount = totalPriceSelectedShirts * (percentDiscount / 100);

        final float totalPriceSelectedShirtsWithDiscount = totalPriceSelectedShirts - amountDiscount;
        final float totalPriceSelectedShirt_WithDiscount = totalPriceSelectedShirtsWithDiscount / amountSelectedShirts;
        final float savedMoney = totalPriceSelectedShirts - totalPriceSelectedShirtsWithDiscount;
        final float freebieShirts = savedMoney / priceShirt;

        System.out.println("priceShirt = " + priceShirt);
        System.out.println("amountSelectedShirts = " + amountSelectedShirts);
        System.out.println("minQuantityShirtsGetDiscount = " + minQuantityShirtsGetDiscount);
        System.out.println("quantityShirtsNeedToGetDiscount = " + quantityShirtsNeedToGetDiscount);

        System.out.println("\ntotalPriceSelectedShirts = " + totalPriceSelectedShirts);
        System.out.println("totalPriceShirtsNeedToGetDiscount = " + totalPriceShirtsNeedToGetDiscount);

        System.out.println("\npercentDiscount = " + percentDiscount);

        System.out.println("\ntotalPriceSelectedShirtsWithDiscount = " + totalPriceSelectedShirtsWithDiscount);
        System.out.println("totalPriceSelectedShirt_WithDiscount = " + totalPriceSelectedShirt_WithDiscount);
        System.out.println("savedMoney = " + savedMoney);
        System.out.println("freebieShirts = " + freebieShirts);
    }
}
