package org.example;

/*
    Странная сумма
    Для чисел от 1 до 100 посчитать сколько получится, если писать 1 - 2 + 3 - 4 и так далее.
 */

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }

        System.out.println("sum = " + sum);
    }
}
