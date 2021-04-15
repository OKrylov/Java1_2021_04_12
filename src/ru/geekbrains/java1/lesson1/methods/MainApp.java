package ru.geekbrains.java1.lesson1.methods;

public class MainApp {
    public static void main(String[] args) {
        drawCat();
        drawCat();

        drawCat2();
    }

    public static void drawCat() {
        System.out.println("           _..---...,\"\"-._     ,/}/)\n" +
                "        .''        ,      ``..'(/-<\n" +
                "       /   _      {      )         \\\n" +
                "      ;   _ `.     `.   <         d(\n" +
                "    ,'   ( \\  )      `.  \\ __.._ .: y\n" +
                "   (  <\\_-) )'-.____...\\  `._   //-'\n" +
                "    `. `-' /-._)))      `-._)))\n" +
                "      `...'         ");
    }

    public static void drawCat2() {
        String picture = """
                      _..---...,""-._     ,/}/)
                     .''        ,      ``..'(/-<
                    /   _      {      )         \\
                   ;   _ `.     `.   <         a(
                 ,'   ( \\  )      `.  \\ __.._ .: y
                (  <\\_-) )'-.____...\\  `._   //-'
                 `. `-' /-._)))      `-._)))
                   `...'         
                   """;
        System.out.println(picture);

        String movie = "'Фильм'";
        String movie43 = "\"Фильм\"";

        int a = 20;
        String b = "My Number = ";
        a *= 20;
        System.out.println(b + a);


    }
}
