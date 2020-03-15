package org.example;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        final int currentHour = time.getHour();

        System.out.println("\ncurrentHour = " + currentHour + "\n");

        if (currentHour < 0) {
            System.out.println("время суток нужно ввести правильно");
        } else if (currentHour > 23) {
            System.out.println("Вам следует вернуться с другой планеты на Землю");
        } else if (currentHour >= 5 && currentHour <= 10) {
            System.out.println("утро");
        } else if (currentHour >= 11 && currentHour <= 16) {
            System.out.println("день");
        } else if (currentHour >= 17 && currentHour <= 23) {
            System.out.println("вечер");
        } else {
            System.out.println("ночь");
        }
    }
}
