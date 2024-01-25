package org.basics;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class PrimeNumberList {
    public static void main(String[] args){
//    Write a program to store the List of prime numbers in a arrayList and print it.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 20);
        System.out.println(numbers.stream().filter(PrimeNumber::isPrime).collect(toList()));
    }
}
