package org.example;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        final int currentHour = time.getHour();

        System.out.println("\ncurrentHour = " + currentHour + "\n");

        if (5 <= currentHour && 10 >= currentHour) {
            System.out.println("утро");
        } else if (11 <= currentHour && 16 >= currentHour) {
            System.out.println("день");
        } else if (17 <= currentHour && 23 >= currentHour) {
            System.out.println("вечер");
        } else {
            System.out.println("ночь");
        }
    }
}
