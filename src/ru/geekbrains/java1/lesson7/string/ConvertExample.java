package ru.geekbrains.java1.lesson7.string;

public class ConvertExample {

    public static void main(String[] args) {
        String str = "123";
        int inum = 100;

        /* converting the string to an int value
         * ,the value of inum2 would be 123 after
         * conversion
         */
        int inum2 = Integer.parseInt(str);

        int sum = inum + inum2;
        System.out.println("Result is: " + sum);

        System.out.println("======================");

        int ivar = 111;
        String str2 = String.valueOf(ivar);
        System.out.println("String is: " + str2);
        //output is: 555111 because the str is a string
        //and the + would concatenate the 555 and str
        System.out.println(555 + str2);
    }
}
