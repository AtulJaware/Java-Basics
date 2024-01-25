package org.basics;

import java.util.Locale;

public class ReverseString {
    public static void main(String[] args) {
        String given="Capgemini";
        StringBuilder rev=new StringBuilder(given);
        rev.reverse();
        //Using StringBuilder
        System.out.println(rev);

        //Using Loop
        String reverse="";
        for(int i=given.length()-1;i>=0;i--){
            reverse=reverse+given.charAt(i);
        }
        System.out.println(reverse);

        char [] ch=given.toCharArray();
        for(int i=ch.length-1;i>=0;i--) {
            System.out.print(ch[i]);
        }
    }
}
