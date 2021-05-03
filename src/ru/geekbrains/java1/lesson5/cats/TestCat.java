package ru.geekbrains.java1.lesson5.cats;

public class TestCat {


    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "Black", 2);

        System.out.println(cat1.age);
        Cat cat2 = new Cat();
        cat2.setName("Markiz");
        cat2.setColor("White");
        cat2.setAge(6);

        System.out.println(cat1.getName());
        System.out.println(cat2.getName());
        cat2.meow();

        System.out.println(cat2.getAge());
        Cat cat3 = cat2;
        cat3.setAge(100);

        System.out.println(cat2.getAge());

        int a = 5;
        int b = a;
        a = 7;
        System.out.println(a);
        System.out.println(b);
    }
}
