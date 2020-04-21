package org.example;
import java.util.*;

/*
  Заполнить массив в цикле
    Объявить целочисленный массив размером 100 элементов.
    Заполнить его элементами с помощью цикла. В первом элементе массива должен быть 1, во втором 2 и так далее до 100.
    Распечатать элементы массива с помощью цикла.
*/

public class Main {
    public static void main(String[] args) {
        final int arrCapacity = 100;

        final List<Integer> arrayOfInt = new ArrayList<Integer>(arrCapacity);

        for (int i = 0; i < arrCapacity; i++) {
            arrayOfInt.add(i + 1);
        }

        arrayOfInt.forEach((number) -> System.out.println(number));
    }
}
