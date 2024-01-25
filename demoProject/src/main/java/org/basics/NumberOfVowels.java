package org.basics;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfVowels {
    public static void main(String[] args) {
        String str ="Capgemini Training";
        List<Character> list = str.chars().mapToObj(a -> (char) a).collect(Collectors.toList());
        Map<Character, Long> map = list.parallelStream().filter(a -> {
            if (a == 'a' || a == 'A' || a == 'i' || a == 'I' || a == 'o' || a == 'O' || a == 'u' || a == 'U' || a == 'e'
                    || a == 'E') {
                return true;
            }
            return false;
        }).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);




        String s="Capgemini Training india";
        String [] arr=s.split(" ");

    }
}
