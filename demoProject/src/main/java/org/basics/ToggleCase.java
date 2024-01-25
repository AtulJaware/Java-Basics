package org.basics;

import java.util.stream.IntStream;

public class ToggleCase {
    // Uppercase the 2nd char of each string in given Array
    public static void main(String[] args) {
        String [] str={"Tyu","yui","tyu"};

       for(int i=0;i<str.length;i++){
           StringBuilder sb =new StringBuilder(str[i]);
           sb.setCharAt(1,Character.toUpperCase(sb.charAt(1)));
           System.out.println(sb);
       }
    }
}
