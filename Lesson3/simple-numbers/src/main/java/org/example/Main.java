package org.example;

import java.util.Random;

/*
    Простые числа
    Простое число это такое число, которое не делится ни на какое другое число нацело.
    Написать программу, которая будет определять простое число в переменной или нет.

 */

public class Main {
    public static void main(String[] args) {
        final int random = (new Random()).nextInt(100);
        boolean isSimpleNumber = true;

        for (int i = 2; i < random; i++) {
            if (random % i == 0) {
                isSimpleNumber = false;
            }
        }

        if (isSimpleNumber) {
            System.out.println(random + " простое число");
        } else {
            System.out.println(random + " непростое число");
        }
    }
}
