package org.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CountWordsHashmap {
    public static void main(String[] args) {
        // Write a java program to count number of words in a string using HashMap.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        String [] arr=str.split("\\s+");

        Map<String,Integer> map=new HashMap<>();
        for(String word:arr){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }
        System.out.println(map);
    }
}
