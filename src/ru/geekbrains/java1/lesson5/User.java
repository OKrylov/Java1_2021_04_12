package ru.geekbrains.java1.lesson5;

public class User {

    private String name;
    private String surname;

    public User(String name, String surname, String lastName) {
        this.name = name;
        this.surname = surname;
    }

    public void jump() {
        System.out.println("Человек " + surname + "прыгнул!");
    }

}
