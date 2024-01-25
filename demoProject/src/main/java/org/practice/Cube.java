package org.practice;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
// Write a Java program to display the cube of the given number up to an integer.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int limit = sc.nextInt();

        System.out.println("Cubes of the numbers from 1 to " + limit + ":");
        for (int i=1; i<=limit; i++) {
            int cube = i*i*i;
            System.out.println(i + "^3 = " + cube);
        }
    }
}
