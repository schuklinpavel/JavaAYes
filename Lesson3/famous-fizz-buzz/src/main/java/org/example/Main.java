package org.example;

/*
    Знаменитый fizz buzz
    Написать программу, которая для каждой цифры в диапазоне от 0 до 100 печатает следующии
    Если цифра делится нацело на три - печатает fizz
    Если цифра делится нацело не пять - печатает buzz
    Если цифра делится и на три и на пять - печатает FizzBuzz
 */

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " = FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " = fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " = buzz");
            }
        }
    }
}
