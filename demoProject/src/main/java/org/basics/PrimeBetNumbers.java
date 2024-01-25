package org.basics;

import java.util.Scanner;

public class PrimeBetNumbers {
    //      Design a Prime Number between 2 to 30.
    public static void main(String arg[]) {
        System.out.print("Enter n value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Prime numbers between 1 to " + n + " are ");
        for (int j = 2; j <= n; j++) {
           int count = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.print(j + "  ");
        }
    }
}
