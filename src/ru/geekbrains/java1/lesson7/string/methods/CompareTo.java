package ru.geekbrains.java1.lesson7.string.methods;

public class CompareTo {

    public static void main(String[] args) {
        compareToExample();
    }

    private static void compareToExample() {
        String str1 = "String method tutorial";
        String str2 = "compareTo method example";
        String str3 = "String method tutorial";

        int var1 = str1.compareTo(str2); // < == >
        System.out.println("str1 & str2 comparison: " + var1);

        int var2 = str1.compareTo(str3);
        System.out.println("str1 & str3 comparison: " + var2);

        int var3 = str2.compareTo("compareTo method example");
        System.out.println("str2 & string argument comparison: " + var3);


        String s1 = "BEGINNERSBOOK"; //uppercase
        String s2 = "beginnersBOOK"; //mixedcase
        System.out.println(s1.compareTo(s2)); //this would return non-zero value
        System.out.println(s1.compareToIgnoreCase(s2)); //this would return zero


        String str4 = "abcd";
        String str5 = "abc";

        char[] data4 = str4.toCharArray();
        for (char c : data4) {
            System.out.print((int) c + " ");
        }
        System.out.println();

        char[] data5 = str5.toCharArray();
        for (char c : data5) {
            System.out.print((int) c + " ");
        }
        System.out.println();
        System.out.println(str5.compareTo(str4));

    }
}
