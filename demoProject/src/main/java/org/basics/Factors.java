package org.basics;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Factors {
    public static void main(String[] args) {
        // Find out factors of given numbers. n=34
        int n=34;
        System.out.println("Factors of "+n+" are : ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }

            System.out.println(IntStream.rangeClosed(1,n).filter(a->n%a==0).boxed().collect(Collectors.toList()));
        }
    }
}
