package org.lambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlphabeticalSort {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("vivo", "oppo", "apple", "samsung");
        Collections.sort(list,(s1,s2)->s1.compareTo(s2));
        System.out.println(list);
    }
}
