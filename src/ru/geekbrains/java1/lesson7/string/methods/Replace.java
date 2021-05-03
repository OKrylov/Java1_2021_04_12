package ru.geekbrains.java1.lesson7.string.methods;

public class Replace {

    public static void main(String[] args) {
        String str = "Site is BeginnersBook.com";

        System.out.print("String after replacing all 'o' with 'p' :" );
        System.out.println(str.replace('o', 'p'));

        System.out.print("String after replacing all 'i' with 'K' :" );
        System.out.println(str.replaceFirst("i", "K"));

        System.out.print("Replacing whole String: " );
        System.out.println(str.replaceAll("(.*)Beginners", "Welcome"));
    }
}
