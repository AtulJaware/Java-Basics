package org.basics;
abstract class Animals {
    public abstract void makeSound();
}
class Dogg extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Bhau Bhau");
    }
}
class Cat extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}
public class AbstractClassImpl {
    public static void main(String[] args) {
        Animals dogg = new Dogg();
        Animals cat = new Cat();

        dogg.makeSound();
        cat.makeSound();
    }
}
