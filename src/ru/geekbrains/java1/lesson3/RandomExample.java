package ru.geekbrains.java1.lesson3;

import java.util.Random;

public class RandomExample {

    public static void main(String[] args) {
        Random rand = new Random();


        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int result = sum(a, b);
        System.out.println("a + b = " + result);

        int c = rand.nextInt(11) + 10; //[10; 20]
        System.out.println(c);
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
