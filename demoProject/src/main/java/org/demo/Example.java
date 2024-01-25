package org.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        s =s.substring(0,1).toUpperCase()+s.substring(1);
        StringBuilder builder =new StringBuilder(s);

        for(int i=0;i<builder.length();i++) {
            if (builder.charAt(i) == ' ') {
                builder.setCharAt(i+1,Character.toUpperCase(builder.charAt(i+1)));
            }
        }
        System.out.println(builder);
        map(builder.toString());
    }

    public static void map(String s){
        Map<String,Integer> m1= new HashMap<>();
        String [] ss = s.split(" ");
        for(String str:ss){
            m1.put(str,str.length());
        }
        System.out.println(m1);
    }
}
