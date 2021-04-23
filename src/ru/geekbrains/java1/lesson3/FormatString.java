package ru.geekbrains.java1.lesson3;

public class FormatString {

    public static void main(String[] args) {
        int min = 10;
        double max = 20.5254631;
        System.out.println("Введите число от " + min + " до " + max);

        String message = String.format("Введите %s от %d до %.2f", "{число}", min, max);
        String message1 = String.format("Введите числа от %1$d до %1$d", min);
        System.out.println(message);
        System.out.println(message1);
    }
}
