package org.basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        int n=13;
        if(n%2==0){
            System.out.println(n+" is Even Number");
        }
        else{
            System.out.println(n+" is Odd Number");
        }

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> even=list.stream().filter(o->o%2==0).collect(Collectors.toList());
        System.out.println(even);
    }
}
