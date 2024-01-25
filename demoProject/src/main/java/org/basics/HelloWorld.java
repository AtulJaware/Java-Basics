package org.basics;

import java.util.stream.IntStream;

public class HelloWorld {
    public static void main(String[] args) {
        int count=10;
        // first (Using repeat method)
        System.out.println("First Logic");
        System.out.println("Hello World\n".repeat(count));

        //second (using loop)
        System.out.println("Second Logic");
        for(int i=1;i<=count;i++){
            System.out.println(i+" time  : Hello World");
        }

        //third (Using java 8)
        System.out.println("Third Logic");
        IntStream.range(0,10).forEach(x->System.out.println("Hello World"));

        //fourth (recursion method)
        System.out.println("Fourth Logic");
        print("Hello World",10);
    }
    public static void print(String str, int count){
        System.out.println(str);
        if (count > 1) {
            print(str, count - 1);
        }
    }
}
