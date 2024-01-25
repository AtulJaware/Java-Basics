package org.practice;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
//        Write a Java program that takes three numbers from the user and prints the greatest number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer :");
        int first=sc.nextInt();
        System.out.println("Enter second integer :");
        int second=sc.nextInt();
        System.out.println("Enter third integer :");
        int third=sc.nextInt();

        int greatest=first;
        if(second>first){
            greatest=second;
        }
        if(third>second){
            greatest=third;
        }
        System.out.println("Greatest Integer = "+greatest);
    }
}
