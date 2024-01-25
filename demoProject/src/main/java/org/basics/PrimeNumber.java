package org.basics;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class PrimeNumber {
    public static void main(String[] args) {

        // First Logic
        int flag = 0;
        int n = 3;
        int m = n / 2;

        if (n == 0 || n == 1) {
            System.out.println(n + " is Not a prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is Not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }

        // Second Logic
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is Not Prime number");
                System.exit(0);
            }
        }
        if (n <= 1) {
            System.out.println(n + " is Not Prime number");
        } else {
            System.out.println(n + " is Prime number");
        }


    }
        public static boolean isPrime(int number) {
        for(int i=2;i<=number/2;i++) {
            if (number % i == 0) {
                return false;
            }
        }
            return true;
        }
}