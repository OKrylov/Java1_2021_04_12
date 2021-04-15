package ru.geekbrains.java1.lesson1.conditions;

public class Example6 {

    public static void main(String[] args) {
        int a = 5;
//        int b;
//
//        if (a > 4) {
//            b = 1;
//        } else {
//            b = -1;
//        }

        int b = (a > 4) ? 1 : -1;

        System.out.println(a);
        System.out.println(b);
    }
}
