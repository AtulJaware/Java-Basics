package org.basics;

import java.util.HashMap;
import java.util.Map;

public class NotDuplicate {
    public static void main(String[] args) {
        // given a Char array is there {'a','b','a','c'} Find out not duplicate character

        char[] arr = {'a', 'b', 'a', 'c'};
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : arr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (char c : arr) {
            if (map.get(c) == 1) {
                System.out.print(c+" ");
            }
        }
    }
}
