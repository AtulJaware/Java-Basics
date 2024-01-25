package org.basics;

public class PolymorphismOverloading {
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public void printMessage(int number) {
        System.out.println("Number: " + number);
    }

    public void printMessage(String message, int number) {
        System.out.println("Message: " + message + ", Number: " + number);
    }

    public static void main(String[] args) {
        PolymorphismOverloading example = new PolymorphismOverloading();
        example.printMessage("Hello");
        example.printMessage(10);
        example.printMessage("Hello", 20);
    }
}
