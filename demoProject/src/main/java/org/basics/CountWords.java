package org.basics;

public class CountWords {
    public static void main(String[] args) {
        String s="Atul Jaware Patil";
        int count=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
