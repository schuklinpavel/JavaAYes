package org.example;
/*
Выбор оффера
Программисту сделали два предложения о работе. Он не может выбрать предложение исходя из предлагаемой компенсации, так как путь до предполагаемых мест работы занимает разное время.
Для того, чтобы нормально выбрать, программист должен посчитать сколько у него будет выходить за час работы, считая время, за которое он будет добираться на работу и потом с работы домой.
Программа должна брать из переменных информацию о ежемесячной компенсации и времени которое занимает путь на работу и обратно и на основании этих данных писать какое предложение выбрать.
*/
public class Main {
    public static void main(String[] args) {
        final int salaryVsegdaDa = 250_000;
        final int salaryVsegdaNet = 200_000;

        final double timeSpentRoadVsegdaDa = 220 / 60;
        final double timeSpentRoadVsegdaNet = 120 / 60;

        final int timeWorkday = 9;

        final double salaryPerTimeVsegdaDa = salaryVsegdaDa / 30 / (timeWorkday + timeSpentRoadVsegdaDa);
        final double salaryPerTimeVsegdaNet = salaryVsegdaNet / 30 / (timeWorkday + timeSpentRoadVsegdaNet);

        System.out.println("salaryPerTimeVsegdaDa = " + salaryPerTimeVsegdaDa);
        System.out.println("salaryPerTimeVsegdaNet = " + salaryPerTimeVsegdaNet);

        if (salaryPerTimeVsegdaDa > salaryPerTimeVsegdaNet) {
            System.out.println("\nВыбирай Всегда-Да");
        } else {
            System.out.println("\nВыбирай Всегда-Нет");
        }
    }
}
