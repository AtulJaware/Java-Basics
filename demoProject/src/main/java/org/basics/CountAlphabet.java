package org.basics;

import java.util.HashMap;
import java.util.Map;

public class CountAlphabet {
    public static void main(String[] args) {
//        write a program to Count the number of alphabets in a given sentence

        String s="capgemini";
        char [] ch=s.toCharArray();
        Map<Character,Integer> map= new HashMap<>();
        for(char c:ch){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
