package ru.geekbrains.java1.lesson2;

public class Loop2 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(i + "=" + j + " ");
            }
            System.out.println();
        }

        System.out.println("while:");
        int a = 5;
        while (a > 0) {
            System.out.println(a);
            a--;
        }

        System.out.println("do-while:");

        int b = 5;
        do {
            System.out.println(b);
            b--;
        } while (b > 0);

        int c = 5;
        while (true) {
            System.out.println(c);
            c--;
            if (c <= 0) {
                break;
            }
        }
    }
}
