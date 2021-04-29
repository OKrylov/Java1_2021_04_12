package ru.geekbrains.java1.lesson6;

public class Test62 {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "White", 3);
        Animal dog = new Dog("Barbos", "Black", 6, "Ovcharka");

//        Cat animal = new Animal("smth", "red", 555);
        ((Cat) cat).sleep();
        System.out.println(cat instanceof Cat);
//        System.out.println(cat instanceof Dog);
        System.out.println(cat instanceof Animal);

        sayVoice(cat);
        sayVoice(dog);

        Animal[] animals = {cat, dog};
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    private static void sayVoice(Animal animal) {
        animal.voice();
    }
}
