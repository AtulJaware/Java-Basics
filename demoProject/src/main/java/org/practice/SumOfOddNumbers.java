package org.practice;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {

// Write a Java program that displays the sum of n odd natural numbers.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i%2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The Sum of odd numbers till "+ n+" ="+sum);
    }
}
