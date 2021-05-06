package ru.geekbrains.java1.lesson7.anonimous;

public class AnonymousClass {

    public static void main(String[] args) {
        Button plusButton = new PlusButton();
        Button minusButton = new MinusButton();

        int a = 10;
        int b = 2;
        System.out.println("a + b: " + plusButton.execute(a, b));
        System.out.println("a - b: " + minusButton.execute(a, b));
        System.out.println("a ^ b: " + new PlusButton() {
            @Override
            public int execute(int a, int b) {
                return (int) Math.pow(a, b);
            }
        }.execute(a, b));
    }

}
