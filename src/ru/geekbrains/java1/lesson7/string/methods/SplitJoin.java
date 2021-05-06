package ru.geekbrains.java1.lesson7.string.methods;

import java.util.Arrays;

public class SplitJoin {

    public static void main(String[] args) {
        String str = "Write once, run everywhere!";

        String[] parts = str.split(" ");
        System.out.println(Arrays.toString(parts));

        parts = str.split(" ", 2);
        System.out.println(Arrays.toString(parts));

        parts = str.split(" ");
        System.out.println(String.join("-", parts));
    }
}
