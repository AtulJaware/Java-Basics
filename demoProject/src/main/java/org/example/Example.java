package org.example;

public class Example {
    // Static variable
    private static final int staticVariable = 100;

    // Non-static variable
    private int nonStaticVariable;

    // Static method
    public static void staticMethod() {
        System.out.println("Static method.");
        System.out.println("Static variable: " + staticVariable);
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("Non-static method.");
        System.out.println("Non-static variable: " + nonStaticVariable);
        System.out.println("Static variable : " + staticVariable);
    }

    public static void main(String[] args) {
        Example.staticMethod();

        Example obj = new Example();
        obj.nonStaticMethod();
    }
}
