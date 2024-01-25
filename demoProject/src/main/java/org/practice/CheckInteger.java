package org.practice;

import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
//        Write a Java program to get a number from the user and print whether it is positive or negative.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer :");
        int i=sc.nextInt();
        if(i>0){
            System.out.println("Positive Integer");
        }
        else if(i==0){
            System.out.println("Integer is Zero");
        }
        else {
            System.out.println("Negative Integer");
        }
    }
}
