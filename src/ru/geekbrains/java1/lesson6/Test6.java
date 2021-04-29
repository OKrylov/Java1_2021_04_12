package ru.geekbrains.java1.lesson6;

public class Test6 {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "White", 3);
        Cat cat2 = new Cat("Barsik", "White", 3);
        Cat cat3 = cat1;




        int a = 5;
        int b = 5;
        System.out.println("a == b: " + (a == b));

        System.out.println("cat1 == cat2: " + (cat1 == cat2));
        System.out.println("cat1.equals(cat2): " + (cat1.equals(cat2)));
        System.out.println("cat1 == cat3: " + (cat1 == cat3));
        System.out.println("cat1.equals(cat3): " + (cat1.equals(cat3)));

        System.out.println("--- Cat Section ---");
        cat1.printInfo();
        cat1.play();
        cat1.sleep();
        cat1.voice();


        Dog dog = new Dog("Barbos", "Black", 6, "Ovcharka");

        System.out.println("--- Dog Section ---");
        dog.printInfo();
        System.out.println(dog.getType());

//        System.out.println("--- Animal Section ---");
//        Animal animal = new Animal("smth", "red", 555);
//        animal.printInfo();

    }
}
