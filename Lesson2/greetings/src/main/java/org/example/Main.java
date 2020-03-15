package org.example;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        final LocalDate date = LocalDate.now();
        final LocalTime time = LocalTime.now();

        final DayOfWeek dayOfWeek = date.getDayOfWeek();

        final int currentDayOfWeek = dayOfWeek.getValue();
        final int currentHour = time.getHour();

        System.out.println("\ndate = " + date);
        System.out.println("time = " + time);
        System.out.println("dayOfWeek = " + dayOfWeek);
        System.out.println("currentHour = " + currentHour);
        System.out.println("currentDayOfWeek = " + currentDayOfWeek + "\n");

        if (currentDayOfWeek < 6) {
            if (currentHour < 8) {
                System.out.println("Доброе утро");
            } else if (currentHour < 12) {
                System.out.println("Всё пропало ты проспал!");
            } else {
                System.out.println("Включай почту, составляй письмо, что сегодня берёшь отгул");
            }
        } else {
            if (currentHour < 12) {
                System.out.println("Доброе утро!");
            } else if (currentHour < 16) {
                System.out.println("Лучше поспать ещё");
            } else if (currentHour < 18) {
                System.out.println("Вставай, тебя ждёт недоигранный Ведьмак!");
            } else {
                System.out.println("Дааа, с режимом надо что-то делать");
            }
        }
    }
}
