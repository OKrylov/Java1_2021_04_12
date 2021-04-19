package ru.geekbrains.java1.lesson3;

public class OverloadMethod {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int res = sum();
        System.out.println(res);
    }

//    private static int sum(int a, int b) {
//        return a + b;
//    }
//
//    private static float sum(float a, int b) {
//        return a + b;
//    }
//
//    private static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//
//    private static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

    private static int sum(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }

        return sum;
    }


}
