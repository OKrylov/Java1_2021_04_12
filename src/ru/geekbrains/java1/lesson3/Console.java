package ru.geekbrains.java1.lesson3;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
//        System.out.println("Введите данные:");
//
//        Scanner scanner = new Scanner(System.in);
////        String s = scanner.nextLine();
////        System.out.println("Пользователь ввёл: " + s);
//
//        int number = scanner.nextInt();
//        System.out.println("number * 2 = " + number * 2);

        exampleNumberOfRange(10, 20);
    }

    private static void exampleNumberOfRange(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Введите значение от " + min +" до " + max);
            number = scanner.nextInt();
        } while (!(number >= min && number <= max));

        System.out.println("Результат: " + number);
    }

}
