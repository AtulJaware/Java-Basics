package org.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterList {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,5,23,22,78,19,90,232);
        // 1) filter even numbers
        System.out.println(list.stream().filter(i ->i%2==0 ).collect(Collectors.toList()));

        // 2) filter prime numbers from a given list
        System.out.println(list.stream().filter(PrimeNumber::isPrime).collect(Collectors.toList()));

        // 3) Sort it in ascending order
        List<String> list2=Arrays.asList("Green","Banana","Mango","Apple");
        int n = list2.size();
        for (int i = 0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (list2.get(j).compareTo(list2.get(j + 1)) > 0) {
                    String temp = list2.get(j);
                    list2.set(j, list2.get(j + 1));
                    list2.set(j + 1, temp);
                }
            }
        }
        System.out.println(list2);


        // 4) find a specific char
        Scanner sc = new Scanner(System.in);
        System.out.println("Given String");
        String ss=sc.nextLine();
        System.out.println("Char :" );
        char c=sc.next().charAt(0);
        int count=0;
      // char [] arr=ss.toCharArray();
       for(int i=0;i<ss.length();i++){
           if(ss.charAt(i)==c){
               count++;
           }
       }
        System.out.println("The character "+c+" repeated "+count+ " times");

    }
}
