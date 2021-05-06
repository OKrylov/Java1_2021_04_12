package ru.geekbrains.java1.lesson7.string;

public class BasicExample {

    public static void main(String[] args) {
        String str = "Beginnersbook";

        char arrch[] = {'h', 'e', 'l', 'l', 'o'};
        String str2 = new String(arrch);

        String str3 = new String("Java String Example");

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);

        for (int i = 0; i < str3.length(); i++) {
//            System.out.print(str3.charAt(i));
            System.out.println((int) str3.charAt(i));
        }

    }
}
