package org.example;

/*
    Простая сумма
    Посчитать сумму геометрической прогрессии для чисел от 0 до 100
 */
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            final double sum = 1 * (1 - Math.pow(2, 100)) / (1 - 2);
            System.out.println("sum = " + sum);
        }
    }
}
