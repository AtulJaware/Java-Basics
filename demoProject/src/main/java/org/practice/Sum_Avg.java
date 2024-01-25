package org.practice;

import java.util.Scanner;

public class Sum_Avg {
    public static void main(String[] args) {
 // Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 5 Numbers :");
        int sum =0;
        double avg;
        for (int i=0; i<5; i++) {
            int number = sc.nextInt();
            sum += number;
        }
        avg =sum/5;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

    }
}
