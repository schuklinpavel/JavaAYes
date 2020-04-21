package org.example;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/*
  Восстановление ДНК динозавров
    Учёные извлекли из янтаря комаров, которые успели попить крови настоящих динозавров. Из крови получили ДНК.
    ДНК закодировали в целочисленном массиве, каждый элемент которого соответствует одному гену.
    Так как времени прошло очень много, в ДНК сильно повреждены и данные, полученные из них не точны.
    Для того, чтобы получить точную картину, учёные извлекли ДНК из нескольких кусков янтаря.
    Предположительно, если в элементе каждого массива по какому-то индексу находится один и тот же ген - это достоверный ген.
    Если по какому-то индексу гены разные, то это видимо, ошибка.
    Нужно написать программу, которая чистит образцы ДНК и оставляет только достоверные гены.
    Для этого нужно взять два массива, сравнить их и поместить элементы, которые у них равны в по соответствующим индексам третьего массива.
    В остальных элементах третьего массива нужно оставить нули.
    Также нужно распечатать третий массив и вывести количество достоверных генов в образцах.
    Так как для тестирования программы настоящие образцы использовать нельзя, нужно сделать их самостоятельно с помощью заполнения случайными числами двух первых массивов.
    Разных генов у динозавров, положим 200, поэтому случайный ген можно получить вот так:
    final int randomGene = ThreadLocalRandom.current().nextInt(200 - 1) + 1;
*/

public class Main {
    public static int getRandom() {
        return ThreadLocalRandom.current().nextInt(200 - 1) + 1;
    }

    public static void main(String[] args) {
        final int arrCapacity = 200;

        final List<Integer> arrayOne = new ArrayList<Integer>(arrCapacity);
        final List<Integer> arrayTwo = new ArrayList<Integer>(arrCapacity);
        final int[] arrayThree = new int[arrCapacity];

        for (int i = 0; i < arrCapacity; i++) {
            arrayOne.add(getRandom());
            arrayTwo.add(getRandom());
        }

        for (int i = 0; i < arrCapacity; i++) {
            if (Objects.equals(arrayOne.get(i), arrayTwo.get(i))) {
                arrayThree[i] = arrayOne.get(i);
            }
        }

        System.out.println(Arrays.toString(arrayThree));
    }
}
