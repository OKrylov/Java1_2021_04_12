package ru.geekbrains.java1.lesson3;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
//        int[] array = new int[8];
//        String[] array = new String[8];
//        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] array = {1, 2, 3, 4, 50};
//        array[5] = 100;

        int[] newArray = new int[6];
//        for (int i = 0; i < array.length; i++) {
//            newArray[i] = array[i];
//        }

//        int[] newArray = Arrays.copyOf(array, 6);
        System.arraycopy(array, 0, newArray, 0, array.length);

        newArray[5] = 100;


//        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(newArray));
        System.out.println(array.length);
        System.out.println(array[array.length - 1]); // [0, length)

//        array[5] = 228;

//        System.out.println(Arrays.toString(array));

        System.out.println("----");

        int[] data = {1, 5, 2, 4, 7, 9, 12};
        for (int i = 0; i < data.length; i++) {
            int value = data[i];
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }

        System.out.println("--------");

//        int[][] data2 = new int[3][];
//        data2[0] = new int[] {1, 2, 3};
//        data2[1] = new int[] {4, 5};
//        data2[2] = new int[] {7, 8, 9, 10};

        int[][] data2 = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9, 10},
        };

        for (int i = 0; i < data2.length; i++) {
//            System.out.println(Arrays.toString(data2[i]));
            int[] innerData = data2[i];
            for (int j = 0; j < innerData.length; j++) {
                System.out.print(innerData[j] + " ");
            }
            System.out.println();
        }


    }
}
