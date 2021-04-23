package ru.geekbrains.java1.lesson3.homework;

import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int lastIndex = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            array[i][i] = array[i][lastIndex - i] = 1;
            System.out.println(Arrays.toString(array[i]));
        }

//        System.out.println(Arrays.toString(array));

//        for (int i = 0; i < array.length; i++) {
//            System.out.println(Arrays.toString(array[i]));
//        }
    }
}
