package org.java8;

import java.util.Arrays;

// Square all prime numbers in the array
public class SquareNumbers {
    public static void main(String[] args) {
       int [] arr={3,4,632,5,2,3,5,6};

        int[] squaredPrimes = Arrays.stream(arr)
                .filter(SquareNumbers::isPrime)
                .map(number -> number * number)
                .toArray();

        System.out.println("Squared Prime Numbers:");
        for (int num : squaredPrimes) {
            System.out.print(num+" ");
        }
    }
   public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
