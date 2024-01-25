package org.practice;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
// Write a Java program to display the multiplication table of a given integer.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Table number :");
        int num=sc.nextInt();
        System.out.println("Table of "+num+" :");

        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }

    }
}
