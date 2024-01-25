package org.lambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortString {
    public static void main(String[] args) {
//        Write a Java program to implement a lambda expression to
//        sort a list of strings in alphabetical order.

        List<String> list= Arrays.asList("oppo", "vivo", "apple", "samsung", "realme");
        Collections.sort(list,(str1,str2)-> str1.compareTo(str2));
        System.out.println(list);
    }
}
