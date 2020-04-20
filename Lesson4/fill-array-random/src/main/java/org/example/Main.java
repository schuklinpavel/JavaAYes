package org.example;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/*
  Заполнить массив случайными элементами
    Объявить целочисленный массив размером 1000 элементов.
    В цикле заполить его случайными числами от 0 до миллиона.
    Для того, чтобы получить случайное число, нужно написать final int randomInt = ThreadLocalRandom.current().nextInt();
    Распечатать элементы массива с помощью цикла.
*/

public class Main {
    public static void main(String[] args) {
        final int arrCapacity = 1000;

        final ArrayList<Integer> arrayOfInt = new ArrayList<Integer>(arrCapacity);

        for (int i = 0; i < arrCapacity; i++) {
            arrayOfInt.add(ThreadLocalRandom.current().nextInt(0, 1_000_000));
        }

        arrayOfInt.forEach((number) -> System.out.println(number));
    }
}
