package org.example;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

/*
  Заготовка долларов
    Разработчик Лена решила ответственно подойти к планированию финансов.
    Каждй месяц она покупала какое-то количество долларов и записывала его в соответствующий элемент целочисленного массива.
    Курс доллара весь год был стабильный - 34 рубля за доллар.
    Нужно завести ещё один массив и записать в него, сколько рублей Лена тратила на закупку долларов каждый месяц.
    Посчитать, сколько долларов Лена закупила за год. Посчитать, сколько рублей Лена потратила за год.
*/

public class Main {
    public static int getRandom() {
        return ThreadLocalRandom.current().nextInt(250, 1_000);
    }

    public static void main(String[] args) {
        final int dollarExchangeRate = 34;

        final int[] boughtDollarsPerMonth = new int[12];
        final int[] spentRublesPerMonth = new int[12];

        AtomicInteger boughtDollarsPerYear = new AtomicInteger();
        AtomicInteger spentRublesPerYear = new AtomicInteger();

        for (int i = 0; i < 12; i++) {
            int boughtDollars = getRandom();
            int spentRubles = boughtDollars * dollarExchangeRate;

            boughtDollarsPerMonth[i] = boughtDollars;
            spentRublesPerMonth[i] = spentRubles;

            boughtDollarsPerYear.addAndGet(boughtDollars);
            spentRublesPerYear.addAndGet(spentRubles);
        }

        System.out.println("boughtDollarsPerMonth = " + Arrays.toString(boughtDollarsPerMonth));
        System.out.println("spentRublesPerMonth = " + Arrays.toString(spentRublesPerMonth));

        System.out.println("boughtDollarsPerYear = " + boughtDollarsPerYear);
        System.out.println("spentRublesPerYear = " + spentRublesPerYear);
    }
}
