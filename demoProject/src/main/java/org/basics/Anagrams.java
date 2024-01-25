package org.basics;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        // How do you prove 2 strings are anagrams
        String s1="Listen";
        String s2="Silent";

        char [] ch1=s1.toLowerCase().toCharArray();
        char [] ch2=s2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("Strings are anagrams");
        }
        else{
            System.out.println("Strings are not anagrams");
        }

    }
}