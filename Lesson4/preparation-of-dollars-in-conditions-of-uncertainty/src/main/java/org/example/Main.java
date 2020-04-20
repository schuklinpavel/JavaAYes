package org.example;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*
  Заготовка долларов в условиях неопределённости
    Разработчик Николай решил ответственно подойти к планированию финансов.
    Каждй месяц он покупал какое-то количество долларов и записывал его в соответствующий элемент целочисленного массива.
    Так как курс доллара колебался, Николай решил завести второй массив для того, чтобы записывать сколько рублей стоил доллар на момент покупки.
    Например, если в первом месяце Николай купил 100 долларов по курсу 35 рублей за доллар, то в нулевой элемент первого массива он запишет 100,
    а в нулевой элемент второго массива он запишет 35.
*/

public class Main {
    public static int getRandom(int from, int to) {
        return ThreadLocalRandom.current().nextInt(from, to);
    }

    public static void main(String[] args) {
        final int[] boughtDollarsPerMonth = new int[12];
        final int[] dollarExchangeRates = new int[12];

        for (int i = 0; i < 12; i++) {
            int boughtDollars = getRandom(250, 900);
            int dollarExchangeRate = getRandom(35, 100);

            boughtDollarsPerMonth[i] = boughtDollars;
            dollarExchangeRates[i] = dollarExchangeRate;
        }

        System.out.println("boughtDollarsPerMonth = " + Arrays.toString(boughtDollarsPerMonth));
        System.out.println("dollarExchangeRates = " + Arrays.toString(dollarExchangeRates));
    }
}
