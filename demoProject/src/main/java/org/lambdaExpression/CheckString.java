package org.lambdaExpression;

import java.util.Scanner;
interface StringChecker {
    boolean checkString(String str);
}
public class CheckString {
    public static void main(String[] args) {
//        Write a Java program to implement a lambda expression to check if a given string is empty.
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s=sc.nextLine();
        StringChecker stringChecker= str -> str.isEmpty();

        System.out.println("Is empty? " + stringChecker.checkString(s));

    }
}
