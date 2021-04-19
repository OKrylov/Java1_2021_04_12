package ru.geekbrains.java1.lesson2;

public class Methods {

    public static void main(String[] args) {
//        greetingWorld();
//        greetingAlexey();
//
//        greeting("Oleg");
//        greeting("Russia");


        int res1 = sumAB(2, 3); // 5
        System.out.println(res1);

        System.out.println(sumAB(5, 15)); // 20
    }

    private static int sumAB(int a, int b) {
        return a + b;
    }

    private static void greetingWorld() {
        System.out.println("Hello, world");
    }

    private static void greetingAlexey() {
        System.out.println("Hello, Alexey!");
    }

    private static void greeting(String name) {
        System.out.println("Hello, " + name);
    }


}
