package ru.geekbrains.java1.lesson2.homework;

public class Homework2 {

    public static void main(String[] args) {
//        boolean resultSum = checkPositiveSum(10, 3);
//        System.out.println("Check sum = " + resultSum);
//        printNumberSign(5);
//        System.out.println("Is negative? " + isNegative(-3));
//        printRepeatedText("I love Java!", 3);
        System.out.println(checkLeapYear(2021));
    }

    private static boolean checkLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private static void printRepeatedText(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }

    private static boolean isNegative(int number) {
        return number < 0;
    }

    private static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }


    private static boolean checkPositiveSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }
}
