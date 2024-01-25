package org.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Reverse the list elements
public class ReverseList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ACS", "EPAM", "ERR", "TCS");

        List<String> reversedList = list.stream().map(str -> new StringBuilder(str)
                        .reverse().toString())
                        .collect(Collectors.toList());

        for (String str : reversedList) {
            System.out.print(str+" ");
        }
    }
}

