package ru.geekbrains.java1.lesson1.firstapp;

public class FirstAppMath {

    public static void main(String[] args) {
        testCommonMath();

        float k = 2 + 2 * 2;
        System.out.println(k);

        double z = (20.0 / 100);
        System.out.println(z * 100 + "%");

        double y = 10 / 3.0;
        System.out.println(y);
        System.out.printf("%.4f", y);
    }

    public static void testCommonMath() {
        int a = 10; // a = 10
        System.out.println(a);

        a++; // увеличить значение переменной a на 1, получим a = 11
        System.out.println(a);

        a--; // уменьшить значение переменной a на 1, получим a = 10
        System.out.println(a);

        //        a = a + 10;
        a += 10; // увеличить значение переменной a на 10, получим a = 20
        System.out.println(a);

        //        a = a * 2;
        a *= 2; // умножить значение переменной a на 2, получим a = 40
        System.out.println(a);

        a /= 4; // поделить значение переменной a на 2, получим a = 10
        System.out.println(a);

        int b = a + 5; // b = 15
        System.out.println(b);

        int c = 16;
        float d = 5.0f;
        System.out.println(c / d);
        System.out.println(c % d);
    }
}
