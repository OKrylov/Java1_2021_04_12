package ru.geekbrains.java1.lesson1.conditions;

public class Example1 {

    public static void main(String[] args) {
        int currentTemperature = 25;
        // Если в переменной currentTemperature лежит число больше 35, 
        // то напечатаем сообщение про жару. В противном случае - про холод.   // В нашем случае 20 <= 35, поэтому в консоль отпечатается холод

        boolean result = currentTemperature > 35;

        if (result) {
            System.out.println("Ох как жарко");
        } else if (currentTemperature > 25) {
            System.out.println("Тепло сегодня на улице, однако!");
        } else if (currentTemperature > 24) {
            System.out.println("Тепло сегодня на улице, однако!!");
        } else if (currentTemperature > 23) {
            System.out.println("Тепло сегодня на улице, однако!");
        } else if (currentTemperature > 22) {
            System.out.println("Тепло сегодня на улице, однако!");
        } else {
            System.out.println("Что-то прохладно сегодня на улице");
        }

        System.out.println("Finish");
    }

}
