package org.basics;
interface Animal{
    void eat();
        }
interface Human {
    void run();
}
class Dog implements Animal, Human {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void run() {
        System.out.println("Dog is running.");
    }
public static class InferitanceExample {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.run();
    }
}
}
