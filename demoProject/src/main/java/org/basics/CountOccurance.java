package org.basics;

import java.util.HashMap;
import java.util.Map;

public class CountOccurance {
    public static void main(String[] args) {
        String s="Capgemini";
        char c='i';
        long count=0;
        // Using lambda expression
        count=s.chars().filter(ch -> ch==c).count();

        // Using loop
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)==c){
//                count++;
//            }
//        }
        System.out.println("The Character "+c+ " Occurs in Given String "+ count+" times");


        // ecah char occurance
        char [] ch=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char cc:ch){
            if(map.containsKey(cc)){
                map.put(cc,map.get(cc)+1);
            }
            else{
                map.put(cc,1);
            }
        }
        System.out.println(map);
    }
}
