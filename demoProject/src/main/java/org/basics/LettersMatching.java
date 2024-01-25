package org.basics;
import java.util.HashMap;
import java.util.Map;

public class LettersMatching {
    public static void main(String[] args) {
//        Write a Java program that checks the letters of the
//        second string are present in the first string.Return true otherwise false.
        String first="vaaj";
        String second="Java";

        System.out.println(checkLetters(first,second));
    }

    public static boolean checkLetters(String firstString, String secondString) {
        // Create a frequency map of characters in the first string
        Map<Character, Integer> map = new HashMap<>();
        for (char c : firstString.toLowerCase().toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        // Check if all characters in the second string are present in the first string
        for (char c : secondString.toLowerCase().toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c) + 1);
        }
        System.out.println(map);
        return true;
    }
}
