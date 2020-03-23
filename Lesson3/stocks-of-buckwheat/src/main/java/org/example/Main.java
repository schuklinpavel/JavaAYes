package org.example;

/*
    Программист Василий очень любит гречку. Поэтому он заготовил запас гречки на годы вперёд который хранится на складе.
    В его запасе 100 килограммов гречки. Хранение одного килограмма в месяц стоит 100 рублей. Плата вносится за месяц вперёд. За месяц Василий съедает примерно 6 килограммов гречки.
    Каждый месяц Василий платит за хранение остатка. То есть в первый месяц от заплатит за 100 килограммов, второй месяц за 94 и так далее, пока гречка не закончится.
    Написать программу, которая посчитает сколько денег нужно будет Василию, чтобы оплатить хранение гречки, до того момента, как он её съест.
    Со звёздочкой. В начале задавать в переменной не сколько килограммов запас Василий, а в течение какого срока он хочет питаться гречкой и рассчитывать остальное исходя из этого.
 */

public class Main {
    public static void main(String[] args) {
        final int initWeight = 100;
        final int monthPayment = 100;
        final int monthAverageСonsumption = 6;
        int amountPayment = 0;

        for (int i = initWeight; i >= 0 ; i = i - monthAverageСonsumption) {
            amountPayment+= monthPayment;
        }
        System.out.println("amountPayment = " + amountPayment);

        final int desiredTerm = 15;
        int amountPayment2 = 0;

        final int amountWeight = monthAverageСonsumption * desiredTerm;
        System.out.println("amountWeight = " + amountWeight);

        for (int i = amountWeight; i >= 0 ; i = i - monthAverageСonsumption) {
            amountPayment2+= monthPayment;
        }
        System.out.println("amountPayment2 = " + amountPayment2);
    }
}
