package org.example;

import java.util.Random;

/*
Бой джедаев и ситхов
Джедай и ситх сошлись в смертельном поединке.
Известно, что если ситх стоит выше джедая, ситх проиграет. Если джедай стоит выше ситха, джедай выигрывает. Если ситх и джедай на одной высоте, победа остаётся за ситхом.
Но из этого правила есть исключения. Ситх Палпатин выигрывает всегда. Джедай Оби Ван выигрырывает у ситха Дарта Мола даже если они стоят на одной и той же высоте.
Если у джедая будет программа, которая сможет в зависимости от положения соперников и их имён определить итог схватки, джедаи смогут не вступать в заведомо проигрышные поединки.
Нужно написать такую программу и помочь джедаям в их борьбе со злом!

 */
public class Main {
    public static void main(String[] args) {
        final String[] siths = {"Palpatine", "Darth Maul", "Jar Jar Binks"};
        final String[] jedis = {"Obi-Wan", "Luke Skywalker", "Jar Jar Binks"};

        final String jediWarrior = jedis[(new Random()).nextInt(jedis.length)];
        final String sithWarrior = siths[(new Random()).nextInt(siths.length)];

        final int heightOfPositionSith = (new Random()).nextInt(3);
        final int heightOfPositionJedi = (new Random()).nextInt(3);

        String vantagePosition;
        if (heightOfPositionJedi == heightOfPositionSith) {
            vantagePosition = "identical";
        } else if (heightOfPositionJedi > heightOfPositionSith) {
            vantagePosition = "jedi";
        } else {
            vantagePosition = "sith";
        }

        System.out.println("jediWarrior = " + jediWarrior);
        System.out.println("sithWarrior = " + sithWarrior);
        System.out.println("vantagePosition = " + vantagePosition);

        if (sithWarrior == "Palpatine" || vantagePosition == "sith") System.out.println("Тактическое отступление");
        else if (sithWarrior == "Darth Maul" && jediWarrior == "Obi-Wan") {
            System.out.println("Победа");
        } else if (vantagePosition == "jedi") {
            System.out.println("Победа");
        } else {
            System.out.println("Тактическое отступление");
        }
    }
}
