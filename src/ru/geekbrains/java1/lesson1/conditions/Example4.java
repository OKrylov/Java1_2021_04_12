package ru.geekbrains.java1.lesson1.conditions;

public class Example4 {

    public static void main(String[] args) {
        int a = 5;

        if (a >= 0) {
            if (a <= 20) {
                System.out.println("В переменной a лежит число от 0 до 20");
            }
        }


        if ((a <= 4 && a >= 0)) {
            System.out.println("В переменной a лежит число от 0 до 20");
        }


    }

}
