package org.example;
import java.util.Arrays;

/*
  Заполнить массив
    Объявить целочисленный массив размером 4 элемента.
    Заполнить его элементами.
    Распечатать элементы массива
*/

public class Main {
    public static void main(String[] args) {
        final String[] letters = new String[4];
        letters[0] = "a";
        letters[1] = "b";
        letters[2] = "v";
        letters[3] = "g";

        System.out.println("letters = " + Arrays.toString(letters));
    }
}
