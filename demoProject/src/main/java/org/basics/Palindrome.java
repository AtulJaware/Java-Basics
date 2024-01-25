package org.basics;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p=sc.nextLine();
        palindrome(p);
    }
    public static void palindrome(String p){
        int length=p.length();
        String reverse="";

        // First (Using loop)
        for(int i=length-1;i>=0;i--){
            reverse=reverse+p.charAt(i);
        }
        if(p.equals(reverse)){
            System.out.println(p+" Is a Pallendrome");
        }
        else{
            System.out.println(p+" Is not a Pallendrome");
        }

        //Second (Using StringBuffer)
        StringBuffer sb= new StringBuffer(p);
        if(sb.reverse().toString().equals(p)) {
            System.out.println(p+" Is a Pallendrome");
        }
        else {
            System.out.println(p+" Is not a Pallendrome");
        }

        // Third (Using Java 8)
        boolean check=IntStream.range(0, p.length() / 2)
                .allMatch(i -> p.charAt(i) == p.charAt(p.length() - i - 1));
        if(check){
            System.out.println(p+" Is a Pallendrome");
        }
        else{
            System.out.println(p+" Is not a Pallendrome");
        }
    }
}
