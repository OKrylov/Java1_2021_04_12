package ru.geekbrains.java1.lesson5.cats;

public class Cat {
    private String name;
    private String color;
    int age;

    public Cat(String name, String color, int age) {
        this.color = color;
        this.name = name;
        this.age = age;
    }

    public Cat(String name) {
        this(name, "Red", 1);
    }

    public Cat() {
        this("Barsik");
    }

    public void meow() {
        System.out.println(buildMeowMessage());
    }

    private String buildMeowMessage() {
        return name + " said 'meow!'";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
//        System.out.println("User sets new value to color = " + color);
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
