package org.basics;

public class FibonaciSeriesBetweenNum {
    public static void main(String[] args) {
        //Find out the Fibonacci series between 1 to 30.
        int limit = 30;

        System.out.println("Fibonacci series between 1 and " + limit + ":");
        int num1 = 0, num2 = 1;

        // Print Fibonacci numbers up to the limit
        while (num1 <= limit) {
            System.out.print(num1 + " ");

            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
