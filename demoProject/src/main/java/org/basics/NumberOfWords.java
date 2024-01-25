package org.basics;

public class NumberOfWords {
    public static void main(String[] args) {
        String s="Atul Gajanan Jaware Patil";
        // Using Loop
        int count=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        System.out.println(count);

        // Using Java 8
        System.out.println(s.chars().filter(n->n==' ').count()+1);

    }
}
