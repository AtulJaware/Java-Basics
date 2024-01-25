package org.lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//        Write a Java program to implement a lambda expression to
//        convert a list of strings to uppercase and lowercase.
public class UpperLowerCase {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Atul","jaware","PATIL");
        list.replaceAll(str -> str.toLowerCase());
        System.out.println(list);

        list.replaceAll(str -> str.toUpperCase());
        System.out.println(list);
    }
}
