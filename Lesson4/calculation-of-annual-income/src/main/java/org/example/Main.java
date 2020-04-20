package org.example;

/*
  Подсчёт дохода за год
    В целочиленном массиве из 12 элементов записана зарплата сотрудника за каждый месяц.
    Нужно посчитать совокупный доход сотрудника за год.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int[] salarysPerMonth = {45000, 50000, 55000, 60000, 65000, 70000, 75000, 80000, 85000, 90000, 95000, 100000};
        int salaryPerYear = 0;

        for (int sm: salarysPerMonth) {
            salaryPerYear += sm;
        }

        System.out.println("salaryPerYear = " + salaryPerYear);
    }
}
