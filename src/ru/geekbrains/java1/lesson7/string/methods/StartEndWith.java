package ru.geekbrains.java1.lesson7.string.methods;

public class StartEndWith {

    public static void main(String[] args) {
        String str = "Hello";
        //This will return true because string str starts with "He"
        System.out.println(str.startsWith("He"));
        System.out.println(str.startsWith("ello", 1));

        String str1 = new String("This is a test String");
        String str2 = new String("Test ABC");
        boolean var1 = str1.endsWith("String");
        boolean var2 = str1.endsWith("ABC");
        boolean var3 = str2.endsWith("String");
        boolean var4 = str2.endsWith("ABC");
        System.out.println("str1 ends with String: "+ var1);
        System.out.println("str1 ends with ABC: "+ var2);
        System.out.println("str2 ends with String: "+ var3);
        System.out.println("str2 ends with ABC: "+ var4);


    }
}
