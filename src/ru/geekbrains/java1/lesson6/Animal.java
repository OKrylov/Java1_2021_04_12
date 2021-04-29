package ru.geekbrains.java1.lesson6;

import java.util.Objects;

public abstract class Animal /*extends Object*/ {

    protected final String name;
    protected final String color;
    protected final int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Animal() {
        this(null, null, 0);
    }

    public void printInfo() {
//        System.out.println("Name: " + name + " color: " + color + " age: " + age);
//        String info = String.format("Name: %s color: %s age: %d", name, color, age);
//        System.out.println(info);
        System.out.println(toString());
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public abstract void voice();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
