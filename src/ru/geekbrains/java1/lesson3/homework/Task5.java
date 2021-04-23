package ru.geekbrains.java1.lesson3.homework;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {
        int length = 5;
        int initialValue = 7;
        int[] array = initArray(length, initialValue);
        System.out.println(Arrays.toString(array));
    }

    private static int[] initArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
//        Arrays.fill(array, initialValue);
        return array;
    }
}
