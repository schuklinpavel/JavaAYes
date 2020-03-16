package org.example;
import java.time.LocalTime;
/*
Контроль на аттракционе
Без родителей на аттракцион пускают только с 15 лет.
Для того, чтобы доказать, что ему 15 лет или больше, ребёнок должен достать головой до планки, которая подвешена на высоте 160 см.
Нужно написать программу, которая в зависимости от роста посетителя и того, пришёл ли он с родителями, напечатает, можно ему на аттракцион или нет.
*/
public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        final int heightOfChildCm = time.getMinute() * 4;
        final int heightOfPlankCm = 160;
        final boolean isChildWithParent = false;

        System.out.println("heightOfChildCm = " + heightOfChildCm);
        System.out.println("heightOfPlankCm = " + heightOfPlankCm);
        System.out.println("isChildWithParent = " + isChildWithParent);

        if (isChildWithParent || heightOfChildCm >= heightOfPlankCm) {
            System.out.println("Можно");
        } else {
            System.out.println("Нельзя");
        }
    }
}
