package org.example;

/*
Похудательная программа
После пропуска своих данных через программу для вычисления идеального веса, программист обнаружил, что ему надо похудеть.
Для того, чтобы похудеть он ведёт учёт потреблённых за день каллорий и перед тем как поесть проверяет, не перейдёт ли он за дневной лимит в 1400 ккал.
За сегодня программист уже употребил какое-то количество каллорий.
На ужин у него есть выбор - съесть шоколадку на 340 ккал, тарелку каши на 250 ккал или кусок сала на 500 ккал. Съесть можно только что-то одно.
Помоги программисту! Напиши программу, которая посмотрит, сколько каллорий программист уже употребил и скажет какое из блюд программисту можно съесть перед сном.
У программиста нет предпочтений, можно выбрать любое блюдо, в котором не слишком много каллорий.
Если во всех блюдах слишком много каллорий, программа должна написать, что лимит каллорий на сегодня исчерпан.
 */
public class Main {
    public static void main(String[] args) {
        final int caloriesDayLimit = 1400;
        final int consumedСalories = 1000;

        final int caloriesOfChocolate = 340;
        final int caloriesOfCerealBowl = 250;
        final int caloriesOfSpeck = 500;

        final int stillCaloriesOnToday = caloriesDayLimit - consumedСalories;
        boolean isCalorieLimitExhaustedToday = true;

        System.out.println("stillCaloriesOnToday = " + stillCaloriesOnToday);
        System.out.println("initial value of isCalorieLimitExhaustedToday = " + isCalorieLimitExhaustedToday);

        if (stillCaloriesOnToday >= caloriesOfChocolate) {
            isCalorieLimitExhaustedToday = false;
            System.out.println("Можно съесть шоколадку");
        }
        if (stillCaloriesOnToday >= caloriesOfCerealBowl) {
            isCalorieLimitExhaustedToday = false;
            System.out.println("Можно съесть тарелку каши");
        }
        if (stillCaloriesOnToday >= caloriesOfSpeck) {
            isCalorieLimitExhaustedToday = false;
            System.out.println("Можно съесть сало");
        }

        if (isCalorieLimitExhaustedToday) {
            System.out.println("Лимит каллорий на сегодня исчерпан");
        }
    }
}
