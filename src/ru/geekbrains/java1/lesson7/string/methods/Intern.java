package ru.geekbrains.java1.lesson7.string.methods;

public class Intern {

    public static void main(String[] args) {
        String str1 = "str";
        String str2 = "str";
        String str3 = new String("str");
//        System.out.println("str1.equals(str2): " + (str1.equals(str2)));
//        System.out.println("str1.equals(str3): " + (str1.equals(str3)));

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));

        System.out.println("Interning...");
        String str4 = str3.intern();
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 == str4: " + (str1 == str4));
    }
}
