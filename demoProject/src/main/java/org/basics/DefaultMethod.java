package org.basics;


//Write a program to implement the defalut method in a Fuctional interface and override it.
interface myinterface{
    default void defaultMethod(){
        System.out.println("Default method from interface");
    }
    void abstractMethod();

}
public class DefaultMethod implements myinterface{

    @Override
    public void abstractMethod() {
        System.out.println("abstractMethod Implement");
    }

    @Override
    public void defaultMethod(){
        System.out.println("defaultMethod override");
    }

    public static void main(String[] args) {
        DefaultMethod dm=new DefaultMethod();
        dm.abstractMethod();
        dm.defaultMethod();
    }
}
