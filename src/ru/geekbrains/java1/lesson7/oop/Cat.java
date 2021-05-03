package ru.geekbrains.java1.lesson7.oop;

public class Cat {
    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        System.out.println("Кот начал есть!");
        p.decreaseFood(appetite);
    }
}
