package org.example;
import java.util.Arrays;

/*
  Подсчёт премии
    В целочиленном массиве из 12 элементов записана зарплата сотрудника за каждый месяц.
    В компании каждый чётный месяц выдаётся премия в 10%, а каждый нечётный 20%.
    Нужно посчитать премию за каждый месяц и записать ещё во второй массив.
*/


public class Main {
    public static void main(String[] args) {
        final int[] salaryPerMonth = {45500, 50000, 55700, 60000, 65000, 70000, 75000, 80300, 85000, 90000, 95000, 100000};
        final float[] bonusPerMonth = new float[12];

        for (int i = 0; i < salaryPerMonth.length; i++) {
            final boolean isEvenMonth = (i + 1) % 2 == 0;

            if (isEvenMonth) {
                bonusPerMonth[i] = salaryPerMonth[i] * 0.1f;
            } else {
                bonusPerMonth[i] = salaryPerMonth[i] * 0.2f;
            }
        }

        System.out.println(Arrays.toString(bonusPerMonth));
    }
}
