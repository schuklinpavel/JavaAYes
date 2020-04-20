package org.example;
import java.util.Arrays;

/*
  Подсчёт квартальных премий
    В целочиленном массиве из 12 элементов записана зарплата сотрудника за каждый месяц.
    В компании за каждый квартал выдаётся премия 15%, плюс 15% годовой премии.
    Нужно сделать массив из четырёх элементов, в каждый из которых поместить премию за соответствующий квартал.
    Нужно распечатать премии за все кварталы и премию за год.
*/


public class Main {
    public static void main(String[] args) {
        final int[] salaryPerMonth = {45500, 50000, 55700, 60000, 65000, 70000, 75000, 80300, 85000, 90000, 95000, 100000};
        final float[] bonusPerQuarter = new float[4];
        final int bonusPerYear = 150_000;
        int salaryPerQuarter = 0;

        for (int i = 0; i < salaryPerMonth.length; i++) {
            final boolean isQuarterEnd = (i + 1) % 3 == 0;

            if (isQuarterEnd) {
                bonusPerQuarter[i / 3] = (salaryPerQuarter / 3) * 0.15f + (bonusPerYear * 0.15f);
                salaryPerQuarter = 0;
            } else {
                salaryPerQuarter += salaryPerMonth[i];
            }
        }

        System.out.println(Arrays.toString(bonusPerQuarter));
        System.out.println("bonusPerYear = " + bonusPerYear);
    }
}
