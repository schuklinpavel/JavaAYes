package org.example;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/*
  Скопировать элементы из одного массива в другой
    Объявить целочисленный массив размером 1000 элементов.
    В цикле заполить его случайными числами от 0 до миллиона.
    Объявить целочисленный массив такого же размера.
    Скопировать элементы из первого массива во второй массив. Нужно делать это с помощью цикла.
*/

public class Main {
    public static void main(String[] args) {
        final int arrCapacity = 1000;

        final ArrayList<Integer> arrayOfInt = new ArrayList<Integer>(arrCapacity);
        final ArrayList<Integer> anotherArrayOfInt = new ArrayList<Integer>(arrCapacity);

        for (int i = 0; i < arrCapacity; i++) {
            arrayOfInt.add(ThreadLocalRandom.current().nextInt(0, 1_000_000));
        }

        anotherArrayOfInt.addAll(arrayOfInt);

        anotherArrayOfInt.forEach((number) -> System.out.println(number));


    }
}
