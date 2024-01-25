package org.practice;

public class RightAnglePattern {
    public static void main(String[] args) {
// Write a Java program to display the pattern like a right angle triangle with a star ( * ).

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
