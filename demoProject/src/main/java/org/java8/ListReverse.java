package org.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListReverse {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> revList = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        System.out.println(revList);
    }
}
