package ru.geekbrains.java1.lesson6;

public class Dog extends Animal {

    private final String type;

    public Dog(String name, String color, int age, String type) {
        super(name, color, age);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void voice() {
        System.out.println("Bark!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
}
