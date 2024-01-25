package org.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountVowels {
//    Reverse a String called “Capgemini Training” Count the number of Vowels in it
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb =new StringBuilder(s);
        System.out.println(sb.reverse());
        String l=s.toLowerCase();
        Map<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=l.charAt(i);
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'){
                if(map.containsKey(c)){
                    map.put(c,map.get(c)+1);
                }
                else{
                    map.put(c,1);
                }
            }
        }
        System.out.println(map);
    }
}
