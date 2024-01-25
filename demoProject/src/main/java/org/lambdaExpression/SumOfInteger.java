package org.lambdaExpression;

import java.util.Scanner;
interface Calculator{
    void sum(int a, int b);
}
public class SumOfInteger {
    public static void main(String[] args) {

//        Write a Java program to implement a lambda expression to find the sum of two integers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int a = sc.nextInt();
        System.out.println("Enter num2: ");
        int b = sc.nextInt();

        Calculator calculator = (i, j) -> System.out.println("Sum of 2 number : "+i + j);

        calculator.sum(a,b);

    }
}
