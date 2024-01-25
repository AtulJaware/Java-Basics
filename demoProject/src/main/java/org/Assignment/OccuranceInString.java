package org.Assignment;

import java.util.HashMap;
import java.util.Map;

public class OccuranceInString {
    public static void main(String[] args) {
        String str="Capgemini";
        char [] ch=str.toCharArray();
        Map<Character,Integer> map= new HashMap<>();
        for(char c:ch){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
